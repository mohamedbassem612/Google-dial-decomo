package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class eux implements defpackage.eqx {
    public final int a;
    public final aify b;

    public eux(int i, java.util.List list) {
        ahvr.bN(!list.isEmpty(), "referencedTrackIds must not be empty");
        this.a = i;
        this.b = aify.n(list);
    }

    @Override // defpackage.eqx
    public final /* synthetic */ defpackage.eqg a() {
        return null;
    }

    @Override // defpackage.eqx
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.eux) {
            defpackage.eux euxVar = (defpackage.eux) obj;
            if (this.a == euxVar.a && ahvr.aP(this.b, euxVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a + 527) * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        aify aifyVar = this.b;
        return "Mp4TrackReference: type=" + defpackage.euu.e(this.a) + ", trackIds=" + java.lang.String.valueOf(aifyVar);
    }

    @Override // defpackage.eqx
    public final /* synthetic */ void b(defpackage.eqv eqvVar) {
    }
}
