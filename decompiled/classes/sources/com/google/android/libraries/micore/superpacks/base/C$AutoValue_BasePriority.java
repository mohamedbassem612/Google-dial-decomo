package com.google.android.libraries.micore.superpacks.base;

/* JADX INFO: renamed from: com.google.android.libraries.micore.superpacks.base.$AutoValue_BasePriority, reason: invalid class name */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
abstract class C$AutoValue_BasePriority extends com.google.android.libraries.micore.superpacks.base.BasePriority {
    private final int b;
    private final int c;

    public C$AutoValue_BasePriority(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    @Override // com.google.android.libraries.micore.superpacks.base.BasePriority
    public final int a() {
        return this.c;
    }

    @Override // com.google.android.libraries.micore.superpacks.base.BasePriority
    public final int b() {
        return this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.libraries.micore.superpacks.base.BasePriority) {
            com.google.android.libraries.micore.superpacks.base.BasePriority basePriority = (com.google.android.libraries.micore.superpacks.base.BasePriority) obj;
            if (this.b == basePriority.b() && this.c == basePriority.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b ^ 1000003) * 1000003) ^ this.c;
    }
}
