package com.google.android.libraries.abuse.hades.tartarus.core;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
@com.google.android.apps.common.proguard.UsedByNative
public final class C extends aazc {

    @com.google.android.apps.common.proguard.UsedByNative
    public final java.nio.ByteBuffer a;

    @com.google.android.apps.common.proguard.UsedByNative
    public final int b;
    public final java.nio.ByteBuffer c;
    public final int d;

    public C(java.nio.ByteBuffer byteBuffer, int i) {
        aooh.f(byteBuffer, "a");
        this.a = byteBuffer;
        this.b = i;
        this.c = byteBuffer;
        this.d = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.libraries.abuse.hades.tartarus.core.C) {
            com.google.android.libraries.abuse.hades.tartarus.core.C c = (com.google.android.libraries.abuse.hades.tartarus.core.C) obj;
            if (aooh.n(this.a, c.a) && this.b == c.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }
}
