package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class afoy implements defpackage.ejv {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public afoy(afpb afpbVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(afpbVar);
        this.a = afpbVar;
    }

    @Override // defpackage.ejv
    public final void a(ejx ejxVar, boolean z, float f) {
        if (this.$cid == 0) {
            java.util.ArrayList arrayList = ejxVar.r;
            int iIndexOf = arrayList.indexOf(this);
            if (iIndexOf >= 0) {
                arrayList.set(iIndexOf, null);
            }
            ((afpb) this.a).d();
            return;
        }
        if (z) {
            return;
        }
        java.lang.Object obj = this.a;
        if (f < 1.0f) {
            defpackage.gkv gkvVar = (defpackage.gkv) obj;
            long jH = gkvVar.h();
            glh glhVar = gkvVar.g;
            gkz gkzVarG = glhVar.g(0);
            gkz gkzVar = gkzVarG.m;
            gkzVarG.m = null;
            glhVar.y(-1L, gkvVar.a);
            glhVar.y(jH, -1L);
            gkvVar.a = jH;
            java.lang.Runnable runnable = gkvVar.f;
            if (runnable != null) {
                runnable.run();
            }
            ((gkz) glhVar).o.clear();
            if (gkzVar != null) {
                gkzVar.s(gkzVar, defpackage.gky.b, true);
            }
            glhVar.s(glhVar, defpackage.gky.b, true);
        } else {
            gkz gkzVar2 = ((defpackage.gkv) obj).g;
            gkzVar2.s(gkzVar2, defpackage.gky.b, false);
        }
        ((defpackage.gkv) obj).g.v();
    }

    public /* synthetic */ afoy(defpackage.gkv gkvVar, int i) {
        this.$cid = i;
        this.a = gkvVar;
    }
}
