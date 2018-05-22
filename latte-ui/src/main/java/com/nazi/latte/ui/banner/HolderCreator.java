package com.nazi.latte.ui.banner;

import com.bigkoo.convenientbanner.holder.CBViewHolderCreator;

/**
 * Created by nazi
 */

public class HolderCreator  implements CBViewHolderCreator<ImageHolder>{
    @Override
    public ImageHolder createHolder() {
        return new ImageHolder();
    }
}
