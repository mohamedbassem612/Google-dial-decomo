package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class jlh implements lv {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public jlh(defpackage.dy dyVar, int i) {
        this.$cid = i;
        this.a = dyVar;
    }

    public final boolean a(android.view.MenuItem menuItem) {
        if (this.$cid != 0) {
            return ((defpackage.dy) this.a).a.onMenuItemSelected(0, menuItem);
        }
        if (((fv) menuItem).a != 2131428024) {
            return false;
        }
        defpackage.jlm jlmVar = (defpackage.jlm) this.a;
        jlmVar.f.o((rmx) ((defpackage.jlp) jlmVar.a().e.c()).a.d.get(defpackage.jmr.c));
        jlmVar.d.i(zoe.N(aosv.F(jlmVar.h, 0, new defpackage.jlk(jlmVar, (aoln) null, 2, (char[]) null), 3)), jlmVar.i);
        jlmVar.c();
        jlmVar.c.f();
        return true;
    }

    public /* synthetic */ jlh(defpackage.jlm jlmVar, int i) {
        this.$cid = i;
        this.a = jlmVar;
    }
}
