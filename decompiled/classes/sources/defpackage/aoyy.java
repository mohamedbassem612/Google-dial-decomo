package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aoyy extends defpackage.aozu {
    public long a = -1;
    public defpackage.aoln b;

    @Override // defpackage.aozu
    public final /* bridge */ /* synthetic */ boolean a(java.lang.Object obj) {
        defpackage.aoyw aoywVar = (defpackage.aoyw) obj;
        if (this.a >= 0) {
            return false;
        }
        long j = aoywVar.b;
        if (j < aoywVar.c) {
            aoywVar.c = j;
        }
        this.a = j;
        return true;
    }

    @Override // defpackage.aozu
    public final /* bridge */ /* synthetic */ defpackage.aoln[] b(java.lang.Object obj) {
        boolean z = defpackage.aosu.a;
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return ((defpackage.aoyw) obj).k(j);
    }
}
