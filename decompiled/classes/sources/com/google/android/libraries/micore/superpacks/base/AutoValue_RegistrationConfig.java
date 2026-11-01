package com.google.android.libraries.micore.superpacks.base;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class AutoValue_RegistrationConfig extends com.google.android.libraries.micore.superpacks.base.C$AutoValue_RegistrationConfig {
    private volatile transient java.lang.String j;

    @Override // com.google.android.libraries.micore.superpacks.base.RegistrationConfig
    public final java.lang.String toString() {
        if (this.j == null) {
            synchronized (this) {
                if (this.j == null) {
                    this.j = super.toString();
                    if (this.j == null) {
                        throw new java.lang.NullPointerException("toString() cannot return null");
                    }
                }
            }
        }
        return this.j;
    }
}
