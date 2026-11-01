package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nkm {
    public static final yno a;

    static {
        aoiu[] aoiuVarArr = new aoiu[3];
        aoiuVarArr[0] = new aoiu("reasoning", new yno(2, (java.lang.String) null, (aify) null, (aify) null, (aigf) null, (java.lang.String) null));
        aojo aojoVar = defpackage.nkl.e;
        java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(aojoVar, 10));
        aojl aojlVar = new aojl(aojoVar);
        while (aojlVar.hasNext()) {
            arrayList.add(((defpackage.nkl) aojlVar.next()).name());
        }
        aoiuVarArr[1] = new aoiu("intent", new yno(2, "enum", aify.n(arrayList), (aify) null, (aigf) null, (java.lang.String) null));
        aoiuVarArr[2] = new aoiu("category", new yno(2, (java.lang.String) null, (aify) null, (aify) null, (aigf) null, (java.lang.String) null));
        aigf aigfVarI = aigf.i(ajsz.aO(aoiuVarArr));
        java.util.List listBb = ajsz.bb(new java.lang.String[]{"reasoning", "intent"});
        a = new yno(7, (java.lang.String) null, (aify) null, listBb == null ? null : aify.n(listBb), aigfVarI, "CallScreenLiteResponse");
    }
}
