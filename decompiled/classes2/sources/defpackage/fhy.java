package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fhy extends defpackage.fif implements java.lang.Comparable {
    private final int e;
    private final int f;

    public fhy(int i, defpackage.ern ernVar, int i2, defpackage.fib fibVar, int i3) {
        super(i, ernVar, i2);
        this.e = defpackage.hgt.aw(i3, fibVar.V) ? 1 : 0;
        this.f = this.d.a();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(defpackage.fhy fhyVar) {
        return java.lang.Integer.compare(this.f, fhyVar.f);
    }

    @Override // defpackage.fif
    public final int b() {
        return this.e;
    }

    @Override // defpackage.fif
    public final /* bridge */ /* synthetic */ boolean c(defpackage.fif fifVar) {
        return false;
    }
}
