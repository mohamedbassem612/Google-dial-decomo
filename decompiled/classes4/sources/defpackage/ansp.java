package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class ansp extends defpackage.anst {
    public final boolean a;
    private anqw h;
    private anph i;

    public ansp(defpackage.anrx anrxVar, defpackage.anlw anlwVar, int i, boolean z) {
        super(anrxVar, anlwVar, i);
        this.a = z;
    }

    @Override // defpackage.anst
    protected final void a(anqw anqwVar) {
        ((defpackage.anvr) this.g).a(anqwVar, defpackage.anvq.a, new anph());
    }

    @Override // defpackage.anst
    protected final void b() {
        this.f.e();
        this.f.f();
        m(defpackage.ansr.f);
        ((defpackage.anvr) this.g).a(this.h, defpackage.anvq.a, this.i);
        o();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: anqx */
    @Override // defpackage.anst
    public final void c(int i, android.os.Parcel parcel) throws anqx {
        anph anphVarA = defpackage.antb.a(parcel, this.c);
        this.f.d();
        ((defpackage.anvr) this.g).c(anphVarA);
    }

    @Override // defpackage.anst
    public final void d(int i, android.os.Parcel parcel) {
        this.h = anty.n(i, parcel);
        this.i = defpackage.antb.a(parcel, this.c);
    }

    @Override // defpackage.anst
    public final boolean e() {
        return this.a;
    }
}
