package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bfm extends cmv {
    private defpackage.bfl a;

    public bfm(defpackage.bfl bflVar) {
        this.a = bflVar;
    }

    private final void d() {
        defpackage.bfl bflVar = this.a;
        if (bflVar instanceof defpackage.bfl) {
            if (bflVar == null) {
                aooh.h("null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            }
            bflVar.a.m(this);
        }
    }

    public final void b(defpackage.bfl bflVar) {
        d();
        if (bflVar instanceof defpackage.bfl) {
            bflVar.a.n(this);
        }
        this.a = bflVar;
    }

    public final boolean cO() {
        return false;
    }

    public final void dc() {
        b(this.a);
    }

    public final void u() {
        d();
    }
}
