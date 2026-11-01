package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class fzl {
    public int a;
    public int b;
    public boolean d;
    public final defpackage.aojw c = new defpackage.aojw();
    public final defpackage.ajni e = new defpackage.ajni(null, null, null);

    public final java.util.List a() {
        if (!this.d) {
            return defpackage.aokc.a;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.ajni ajniVar = this.e;
        defpackage.aojw aojwVar = this.c;
        defpackage.gab gabVarG = ajniVar.g();
        if (aojwVar.isEmpty()) {
            arrayList.add(new defpackage.gah(gabVarG));
        } else {
            arrayList.add(defpackage.dzn.m(defpackage.ajsz.bZ(aojwVar), this.a, this.b, gabVarG));
        }
        return arrayList;
    }
}
