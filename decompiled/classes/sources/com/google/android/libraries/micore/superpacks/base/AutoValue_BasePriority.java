package com.google.android.libraries.micore.superpacks.base;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class AutoValue_BasePriority extends com.google.android.libraries.micore.superpacks.base.C$AutoValue_BasePriority {
    private volatile transient java.lang.String b;

    public AutoValue_BasePriority(int i, int i2) {
        super(i, i2);
    }

    @Override // com.google.android.libraries.micore.superpacks.base.BasePriority
    public final java.lang.String toString() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    this.b = super.toString();
                    if (this.b == null) {
                        throw new java.lang.NullPointerException("toString() cannot return null");
                    }
                }
            }
        }
        return this.b;
    }
}
