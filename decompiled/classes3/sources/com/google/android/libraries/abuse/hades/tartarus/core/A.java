package com.google.android.libraries.abuse.hades.tartarus.core;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
@com.google.android.apps.common.proguard.UsedByNative
public final class A implements java.lang.AutoCloseable {

    @com.google.android.apps.common.proguard.UsedByNative
    private long h;

    public A(com.google.android.libraries.abuse.hades.tartarus.core.C[] cArr) {
        aooh.f(cArr, "protectionComponents");
        afsq.cN();
        this.h = a(cArr, false);
    }

    @com.google.android.apps.common.proguard.UsedByNative
    private final native long a(com.google.android.libraries.abuse.hades.tartarus.core.C[] cArr, boolean z);

    @com.google.android.apps.common.proguard.UsedByNative
    private final native com.google.android.libraries.abuse.hades.tartarus.core.C b(int i, com.google.android.libraries.abuse.hades.tartarus.core.C c, com.google.android.libraries.abuse.hades.tartarus.core.C c2);

    @com.google.android.apps.common.proguard.UsedByNative
    private final native com.google.android.libraries.abuse.hades.tartarus.core.C c(int i, com.google.android.libraries.abuse.hades.tartarus.core.C c, com.google.android.libraries.abuse.hades.tartarus.core.C c2);

    @com.google.android.apps.common.proguard.UsedByNative
    private final native boolean d();

    @com.google.android.apps.common.proguard.UsedByNative
    private final boolean e(int i) {
        return false;
    }

    @com.google.android.apps.common.proguard.UsedByNative
    private final com.google.android.libraries.abuse.hades.tartarus.core.C f(long j, int i, com.google.android.libraries.abuse.hades.tartarus.core.C c, com.google.android.libraries.abuse.hades.tartarus.core.C c2) {
        throw new java.lang.IllegalArgumentException("unavailable");
    }

    @com.google.android.apps.common.proguard.UsedByNative
    private final com.google.android.libraries.abuse.hades.tartarus.core.C g(long j, int i, com.google.android.libraries.abuse.hades.tartarus.core.C c, com.google.android.libraries.abuse.hades.tartarus.core.C c2) {
        throw new java.lang.IllegalArgumentException("unavailable");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.h != 0) {
            d();
            this.h = 0L;
        }
    }
}
