package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lwv implements teu {
    private final /* synthetic */ int $cid;
    final /* synthetic */ tev a;
    private final tep b;
    private final java.lang.Integer c;
    private final aenj d;

    public lwv(tep tepVar, tev tevVar, int i, byte[] bArr) {
        this.$cid = i;
        this.a = tevVar;
        this.b = tepVar;
        this.c = java.lang.Integer.valueOf(((defpackage.kkq) tevVar).c);
        this.d = snl.aI(tevVar);
    }

    public final /* synthetic */ teo a() {
        if (this.$cid != 0) {
        }
        return snl.aJ(this);
    }

    public final tep b() {
        int i = this.$cid;
        return this.b;
    }

    public final aenj c() {
        int i = this.$cid;
        return this.d;
    }

    public final java.lang.Integer d() {
        int i = this.$cid;
        return this.c;
    }

    public final java.lang.Object e(tgy tgyVar, aoln aolnVar) {
        int i = this.$cid;
        if (i == 0) {
            return ((defpackage.lwa) this.a).c((defpackage.lwb) tgyVar, aolnVar);
        }
        if (i != 1) {
            return ((defpackage.lxf) this.a).c((defpackage.lxg) tgyVar, aolnVar);
        }
        return null;
    }

    public final java.lang.Object f(tet tetVar, tej tejVar, aoln aolnVar) {
        int i = this.$cid;
        if (i == 0) {
            return this.a.b(tetVar, tejVar, aolnVar);
        }
        tev tevVar = this.a;
        return i != 1 ? tevVar.b(tetVar, tejVar, aolnVar) : tevVar.b(tetVar, tejVar, aolnVar);
    }

    public final void g(tgy tgyVar, ten tenVar, cav cavVar) {
        int i = this.$cid;
        if (i == 0) {
            cavVar.u(768286271);
            if (tgyVar == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type com.android.dialer.contactsearch.ContactSearchUiModel");
            }
            ((defpackage.lwa) this.a).d((defpackage.lwb) tgyVar, tenVar, cavVar, 0);
            cavVar.o();
            return;
        }
        if (i != 1) {
            cavVar.u(768286271);
            if (tgyVar == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type com.android.dialer.contactsearch.SuggestedContactSearchUiModel");
            }
            ((defpackage.lxf) this.a).d((defpackage.lxg) tgyVar, tenVar, cavVar, 0);
            cavVar.o();
            return;
        }
        cavVar.u(768286271);
        if (tgyVar == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.android.dialer.calllog.search.CallLogSearchUiModel");
        }
        ((defpackage.kkq) this.a).c((defpackage.kkr) tgyVar, tenVar, cavVar, 0);
        cavVar.o();
    }

    public lwv(tep tepVar, tev tevVar, int i) {
        this.$cid = i;
        this.a = tevVar;
        this.b = tepVar;
        this.c = 2132019178;
        this.d = snl.aI(tevVar);
    }

    public lwv(tep tepVar, tev tevVar, int i, char[] cArr) {
        this.$cid = i;
        this.a = tevVar;
        this.b = tepVar;
        this.c = 2132020312;
        this.d = snl.aI(tevVar);
    }
}
