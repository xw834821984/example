package com.nazi.latte.delegates;

/**
 * Created by nazi on
 * date： 2017/12/6
 */

public abstract class LatteDelegate extends PermissionCheckerDelegate {

    @SuppressWarnings("unchecked")
    public <T extends LatteDelegate> T getParentDelegate() {
        return (T) getParentFragment();
    }
}
