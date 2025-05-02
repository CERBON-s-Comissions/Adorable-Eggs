package com.cerbon.adorable_eggs.neoforge.datagen.providers;

//public class ADEBlockStateProvider extends BlockStateProvider {
//    private final ExistingFileHelper exFileHelper;
//
//    public ADEBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
//        super(output, AdorableEggs.MOD_ID, exFileHelper);
//        this.exFileHelper = exFileHelper;
//    }
//
//    @Override
//    protected void registerStatesAndModels() {
//        ADEBlocks.BLOCKS.getEntries().forEach(block -> eggBlock(block.get()));
//    }
//
//    private void eggBlock(Block eggBlock) {
//        this.horizontalBlock(eggBlock, new ModelFile.ExistingModelFile(this.blockTexture(eggBlock), this.exFileHelper));
//    }
//
//    @Override
//    protected BlockStateProviderType<?> type() {
//        return null;
//    }
//
//    @Override
//    public BlockState getState(RandomSource random, BlockPos pos) {
//        return null;
//    }
//}
