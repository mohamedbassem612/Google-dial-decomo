package com.google.android.libraries.micore.superpacks.base;

/* JADX INFO: renamed from: com.google.android.libraries.micore.superpacks.base.$AutoValue_VersionedName, reason: invalid class name */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class C$AutoValue_VersionedName extends com.google.android.libraries.micore.superpacks.base.VersionedName {
    public final java.lang.String a;
    public final int b;

    public C$AutoValue_VersionedName(java.lang.String str, int i) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null name");
        }
        this.a = str;
        this.b = i;
    }

    @Override // com.google.android.libraries.micore.superpacks.base.VersionedName
    public final int a() {
        return this.b;
    }

    @Override // com.google.android.libraries.micore.superpacks.base.VersionedName
    public final java.lang.String b() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.libraries.micore.superpacks.base.VersionedName) {
            com.google.android.libraries.micore.superpacks.base.VersionedName versionedName = (com.google.android.libraries.micore.superpacks.base.VersionedName) obj;
            if (this.a.equals(versionedName.b()) && this.b == versionedName.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }
}
