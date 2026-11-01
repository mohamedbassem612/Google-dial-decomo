package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cfw extends chd {
    public static final defpackage.cfw a = new defpackage.cfw();

    private cfw() {
        super(0, 2);
    }

    protected final void a(chg chgVar, cah cahVar, cfp cfpVar, cjh cjhVar, che cheVar) {
        int i = ((cjb) chgVar.c(0)).a;
        java.util.List list = (java.util.List) chgVar.c(1);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            java.lang.Object obj = list.get(i2);
            int i3 = i + i2;
            cahVar.i(i3, obj);
            cahVar.j(i3, obj);
        }
    }
}
