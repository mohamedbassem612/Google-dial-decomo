package com.google.android.libraries.abuse.hades.tartarus.core;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
@com.google.android.apps.common.proguard.UsedByNative
public final class E implements java.io.Closeable {
    public final j$.util.Optional a;
    private final com.google.android.libraries.abuse.hades.tartarus.core.A b;

    @com.google.android.apps.common.proguard.UsedByNative
    private long h;

    public E(com.google.android.libraries.abuse.hades.tartarus.core.C[] cArr, defpackage.afpl afplVar, afsq afsqVar, j$.util.Optional optional) {
        aooh.f(cArr, "protectionComponents");
        aooh.f(optional, "uriLoader");
        aooh.f(cArr, "protectionComponents");
        com.google.android.libraries.abuse.hades.tartarus.core.A a = new com.google.android.libraries.abuse.hades.tartarus.core.A(cArr);
        aooh.f(optional, "uriLoader");
        this.b = a;
        this.a = optional;
        afsq.cN();
        this.h = u(cArr, a);
    }

    @com.google.android.apps.common.proguard.UsedByNative
    private final native com.google.android.libraries.abuse.hades.tartarus.core.C b(com.google.android.libraries.abuse.hades.tartarus.core.C c, com.google.android.libraries.abuse.hades.tartarus.core.images.U u);

    @com.google.android.apps.common.proguard.UsedByNative
    private final native boolean m();

    @com.google.android.apps.common.proguard.UsedByNative
    private final native long t(int[] iArr, byte[][] bArr);

    @com.google.android.apps.common.proguard.UsedByNative
    private final native long u(com.google.android.libraries.abuse.hades.tartarus.core.C[] cArr, com.google.android.libraries.abuse.hades.tartarus.core.A a);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.h != 0) {
            this.b.close();
            m();
            this.h = 0L;
        }
    }

    @com.google.android.apps.common.proguard.UsedByNative
    public final native com.google.android.libraries.abuse.hades.tartarus.core.C j(com.google.android.libraries.abuse.hades.tartarus.core.C c, com.google.android.libraries.abuse.hades.tartarus.core.images.U u);
}
