package com.google.android.libraries.micore.superpacks.common;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class AutoValue_Slice extends com.google.android.libraries.micore.superpacks.common.C$AutoValue_Slice {
    private volatile transient java.lang.String a;

    @Override // com.google.android.libraries.micore.superpacks.common.Slice
    public final java.lang.String toString() {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    this.a = super.h(false, true);
                    if (this.a == null) {
                        throw new java.lang.NullPointerException("toString() cannot return null");
                    }
                }
            }
        }
        return this.a;
    }
}
