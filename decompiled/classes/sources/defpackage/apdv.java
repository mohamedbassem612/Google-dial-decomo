package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class apdv extends defpackage.apbi {
    public final defpackage.zzx c;

    public apdv(long j, defpackage.apdv apdvVar, int i) {
        super(j, apdvVar, i);
        this.c = new defpackage.zzx(defpackage.apdu.f);
    }

    @Override // defpackage.apbi
    public final int a() {
        return defpackage.apdu.f;
    }

    @Override // defpackage.apbi
    public final void k(int i, defpackage.aolr aolrVar) {
        defpackage.zzx zzxVar = this.c;
        zzxVar.aa(i).c(defpackage.apdu.e);
        r();
    }

    public final java.lang.String toString() {
        return "SemaphoreSegment[id=" + this.b + ", hashCode=" + hashCode() + ']';
    }
}
