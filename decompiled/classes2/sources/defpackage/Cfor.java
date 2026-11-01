package defpackage;

/* JADX INFO: renamed from: for, reason: invalid class name */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class Cfor implements defpackage.eqx {
    public final java.util.List a;

    public Cfor(java.util.List list) {
        this.a = list;
        boolean z = false;
        if (!list.isEmpty()) {
            long j = ((defpackage.foq) list.get(0)).b;
            for (int i = 1; i < list.size(); i++) {
                if (((defpackage.foq) list.get(i)).a < j) {
                    z = true;
                    break;
                }
                j = ((defpackage.foq) list.get(i)).b;
            }
        }
        ahvr.bM(!z);
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
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((defpackage.Cfor) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "SlowMotion: segments=".concat(this.a.toString());
    }

    @Override // defpackage.eqx
    public final /* synthetic */ void b(defpackage.eqv eqvVar) {
    }
}
