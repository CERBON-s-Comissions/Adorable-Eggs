import json
from pathlib import Path
import argparse

def update_textures(json_path: Path):
    """
    Load a JSON file, update its 'textures' section as specified,
    and overwrite the file with the changes.
    """
    # Load
    data = json.loads(json_path.read_text(encoding='utf-8'))

    textures = data.get('textures')
    if not isinstance(textures, dict) or not textures:
        print(f"[SKIP] no 'textures' dict in {json_path.name}")
        return

    # 1. Get whatever the first key is
    first_key = next(iter(textures.keys()))

    # 2. Build new value from filename
    stem = json_path.stem  # e.g. "creeper_egg" for creeper_egg.json
    new_val = f"adorable_eggs:block/{stem}"

    # 3. Update that first key, and set/overwrite 'particle'
    textures[first_key] = new_val
    textures['particle'] = new_val

    # 4. Write back
    json_path.write_text(json.dumps(data, indent=4), encoding='utf-8')
    print(f"[OK]  updated textures in {json_path.name}")


def main(folder: Path):
    folder_path = folder
    if not folder_path.is_dir():
        raise SystemExit(f"Error: '{folder}' is not a directory.")

    for json_file in folder_path.glob("*.json"):
        update_textures(json_file)


if __name__ == "__main__":
    main(Path(__file__).parent.parent / "Common/src/main/resources/assets/adorable_eggs/models/block")
