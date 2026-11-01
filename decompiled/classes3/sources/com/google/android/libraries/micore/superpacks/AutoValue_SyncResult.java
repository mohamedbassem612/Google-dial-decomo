package com.google.android.libraries.micore.superpacks;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class AutoValue_SyncResult extends com.google.android.libraries.micore.superpacks.C$AutoValue_SyncResult {
    private volatile transient java.lang.String b;

    public AutoValue_SyncResult(final aify aifyVar, final aify aifyVar2, final aify aifyVar3, final aify aifyVar4, final boolean z, final boolean z2, final byte[] bArr) {
        new com.google.android.libraries.micore.superpacks.SyncResult(aifyVar, aifyVar2, aifyVar3, aifyVar4, z, z2, bArr) { // from class: com.google.android.libraries.micore.superpacks.$AutoValue_SyncResult
            private final aify b;
            private final aify c;
            private final aify d;
            private final aify e;
            private final boolean f;
            private final boolean g;
            private final byte[] h;

            {
                if (aifyVar == null) {
                    throw new java.lang.NullPointerException("Null oldSelection");
                }
                this.b = aifyVar;
                if (aifyVar2 == null) {
                    throw new java.lang.NullPointerException("Null newSelection");
                }
                this.c = aifyVar2;
                if (aifyVar3 == null) {
                    throw new java.lang.NullPointerException("Null added");
                }
                this.d = aifyVar3;
                if (aifyVar4 == null) {
                    throw new java.lang.NullPointerException("Null removed");
                }
                this.e = aifyVar4;
                this.f = z;
                this.g = z2;
                this.h = bArr;
            }

            @Override // com.google.android.libraries.micore.superpacks.SyncResult
            public final aify a() {
                return this.d;
            }

            @Override // com.google.android.libraries.micore.superpacks.SyncResult
            public final aify b() {
                return this.c;
            }

            @Override // com.google.android.libraries.micore.superpacks.SyncResult
            public final aify c() {
                return this.b;
            }

            @Override // com.google.android.libraries.micore.superpacks.SyncResult
            public final aify d() {
                return this.e;
            }

            @Override // com.google.android.libraries.micore.superpacks.SyncResult
            public final boolean e() {
                return this.f;
            }

            public final boolean equals(java.lang.Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof com.google.android.libraries.micore.superpacks.SyncResult) {
                    com.google.android.libraries.micore.superpacks.SyncResult syncResult = (com.google.android.libraries.micore.superpacks.SyncResult) obj;
                    if (ahvr.aP(this.b, syncResult.c()) && ahvr.aP(this.c, syncResult.b()) && ahvr.aP(this.d, syncResult.a()) && ahvr.aP(this.e, syncResult.d()) && this.f == syncResult.e() && this.g == syncResult.f()) {
                        if (java.util.Arrays.equals(this.h, syncResult instanceof com.google.android.libraries.micore.superpacks.C$AutoValue_SyncResult ? ((com.google.android.libraries.micore.superpacks.C$AutoValue_SyncResult) syncResult).h : syncResult.g())) {
                            return true;
                        }
                    }
                }
                return false;
            }

            @Override // com.google.android.libraries.micore.superpacks.SyncResult
            public final boolean f() {
                return this.g;
            }

            @Override // com.google.android.libraries.micore.superpacks.SyncResult
            public final byte[] g() {
                return this.h;
            }

            public final int hashCode() {
                return ((((((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true == this.g ? 1231 : 1237)) * 1000003) ^ java.util.Arrays.hashCode(this.h);
            }
        };
    }

    @Override // com.google.android.libraries.micore.superpacks.SyncResult
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
