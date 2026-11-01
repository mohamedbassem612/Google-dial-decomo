package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class acfy extends defpackage.aceu {
    static final ahxq a = new defpackage.acfc();
    static final ahyc b = new defpackage.acfw();
    static final ahyc c = new acen(0);

    @Override // defpackage.aceu
    public final void a(defpackage.akvd akvdVar, akzx akzxVar) {
        if (akvdVar.b == 3) {
            akzx akzxVarM = defpackage.akjl.a.m();
            java.lang.String str = (akvdVar.b == 3 ? (defpackage.akvh) akvdVar.c : defpackage.akvh.a).b;
            akzxVarM.u();
            defpackage.akjl akjlVar = (defpackage.akjl) akzxVarM.b;
            j$.util.Objects.requireNonNull(str);
            akjlVar.b |= 1;
            akjlVar.c = str;
            boolean z = (akvdVar.b == 3 ? (defpackage.akvh) akvdVar.c : defpackage.akvh.a).c;
            akzxVarM.u();
            defpackage.akjl akjlVar2 = (defpackage.akjl) akzxVarM.b;
            akjlVar2.b |= 2;
            akjlVar2.d = z;
            akzxVar.u();
            defpackage.akix akixVar = (defpackage.akix) akzxVar.b;
            defpackage.akjl akjlVar3 = (defpackage.akjl) akzxVarM.p();
            defpackage.akix akixVar2 = defpackage.akix.a;
            j$.util.Objects.requireNonNull(akjlVar3);
            akixVar.c = akjlVar3;
            akixVar.b = 3;
        }
    }
}
