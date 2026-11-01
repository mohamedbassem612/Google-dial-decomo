package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class utk implements defpackage.teu {
    private final /* synthetic */ int $cid;
    final /* synthetic */ defpackage.tev a;
    private final defpackage.tep b;
    private final aenj c;

    public utk(defpackage.tep tepVar, defpackage.tev tevVar, int i, byte[] bArr) {
        this.$cid = i;
        this.a = tevVar;
        this.b = tepVar;
        this.c = snl.aI(tevVar);
    }

    @Override // defpackage.teu
    public final /* synthetic */ defpackage.teo a() {
        int i = this.$cid;
        return snl.aJ(this);
    }

    @Override // defpackage.teu
    public final defpackage.tep b() {
        return this.b;
    }

    @Override // defpackage.teu
    public final aenj c() {
        return this.c;
    }

    @Override // defpackage.teu
    public final java.lang.Integer d() {
        return null;
    }

    @Override // defpackage.teu
    public final java.lang.Object e(defpackage.tgy tgyVar, aoln aolnVar) {
        if (this.$cid != 0) {
            return this.a.c((lws) tgyVar, aolnVar);
        }
        return null;
    }

    @Override // defpackage.teu
    public final java.lang.Object f(defpackage.tet tetVar, defpackage.tej tejVar, aoln aolnVar) {
        if (this.$cid != 0) {
            return this.a.b(tetVar, tejVar, aolnVar);
        }
        if (!(tetVar instanceof defpackage.teq)) {
            return null;
        }
        defpackage.utm utmVar = (defpackage.utm) ((defpackage.teq) tetVar).a;
        return new defpackage.utp(utmVar.b, utmVar.a);
    }

    @Override // defpackage.teu
    public final void g(defpackage.tgy tgyVar, defpackage.ten tenVar, cav cavVar) {
        if (this.$cid != 0) {
            cavVar.u(768286271);
            if (tgyVar == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type com.android.dialer.contactsearch.ExtendedDirectoryUiModel");
            }
            this.a.e((lws) tgyVar, tenVar, cavVar, 0);
            cavVar.o();
            return;
        }
        cavVar.u(768286271);
        if (tgyVar == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.android.dialer.timekeeper.search.TimeKeeperSearchUiModel");
        }
        ((defpackage.uto) this.a).c((defpackage.utp) tgyVar, tenVar, cavVar, 0);
        cavVar.o();
    }

    public utk(defpackage.tep tepVar, defpackage.tev tevVar, int i) {
        this.$cid = i;
        this.a = tevVar;
        this.b = tepVar;
        this.c = snl.aI(tevVar);
    }
}
