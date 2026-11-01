package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class jys {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/calllog/clearmissedcalls/ClearMissedCalls");
    public final defpackage.ajct b;
    public final defpackage.rxa c;
    public final defpackage.ojo d;
    public final defpackage.jyu e;
    public final defpackage.aoin f;
    public final defpackage.tuz g;
    private final android.content.Context h;
    private final defpackage.ajct i;

    public jys(android.content.Context context, defpackage.ajct ajctVar, defpackage.ajct ajctVar2, defpackage.tuz tuzVar, defpackage.rxa rxaVar, defpackage.ojo ojoVar, defpackage.jyu jyuVar, defpackage.aoin aoinVar) {
        this.h = context;
        this.b = ajctVar;
        this.i = ajctVar2;
        this.g = tuzVar;
        this.c = rxaVar;
        this.d = ojoVar;
        this.e = jyuVar;
        this.f = aoinVar;
    }

    public static defpackage.rsr d(java.util.Collection collection) {
        defpackage.rsr rsrVar = new defpackage.rsr();
        int i = 0;
        if (collection.isEmpty()) {
            defpackage.rsr rsrVar2 = new defpackage.rsr(new defpackage.kaw("is_read").aI("=", 0));
            rsrVar2.aD(new defpackage.kaw("is_read").aH("IS NULL"));
            rsrVar2.aD(new defpackage.kaw("new").aI("=", 1));
            rsrVar.aC(rsrVar2.aB());
            rsrVar.aC(new defpackage.kaw("type").aI("=", 3));
        } else {
            defpackage.kaw kawVar = new defpackage.kaw("_id");
            java.lang.String[] strArr = new java.lang.String[collection.size()];
            java.util.Iterator it = collection.iterator();
            while (it.hasNext()) {
                strArr[i] = java.lang.Long.toString(((java.lang.Long) it.next()).longValue());
                i++;
            }
            rsrVar.aC(kawVar.aG(strArr));
        }
        return rsrVar.aB();
    }

    private final defpackage.ajcq e(java.util.Collection collection) {
        return this.b.submit(defpackage.ahqx.i(new gzk(this, collection, 10)));
    }

    public final defpackage.ajcq a() {
        defpackage.ajcq ajcqVarE = e(defpackage.aikn.a);
        defpackage.ahrv ahrvVarI = defpackage.ahrv.g(this.c.a()).i(new hky(this, 13), this.b);
        return defpackage.ahvr.ai(ajcqVarE, ahrvVarI).o(defpackage.ahqx.i(new gzk(ajcqVarE, ahrvVarI, 11)), defpackage.ajbm.INSTANCE);
    }

    public final defpackage.ajcq b(java.util.Collection collection) {
        defpackage.ahrv ahrvVarG = defpackage.ahrv.g(e(collection));
        hky hkyVar = new hky(this, 14);
        defpackage.ajct ajctVar = this.i;
        defpackage.ahrv ahrvVarH = ahrvVarG.i(hkyVar, ajctVar).h(new jss(this, 12), ajctVar);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(ahrvVarH);
        arrayList.addAll((java.util.Collection) j$.util.Collection.-EL.stream(collection).map(new jil(this, 3)).collect(defpackage.aido.a));
        return defpackage.ahvr.aj(arrayList).o(new jse(5), ajctVar);
    }

    public final boolean c() {
        android.content.Context context = this.h;
        if (!defpackage.abyl.i(context)) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.c()).m(defpackage.aioa.MEDIUM)).i(defpackage.zct.b)).l("com/android/dialer/calllog/clearmissedcalls/ClearMissedCalls", "canAccessSystemCallLog", (char) 260, "ClearMissedCalls.java")).v("locked");
            return false;
        }
        if (defpackage.zqz.a(context, "android.permission.WRITE_CALL_LOG")) {
            return true;
        }
        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.c()).m(defpackage.aioa.MEDIUM)).i(defpackage.zct.b)).l("com/android/dialer/calllog/clearmissedcalls/ClearMissedCalls", "canAccessSystemCallLog", (char) 265, "ClearMissedCalls.java")).v("no permission");
        return false;
    }
}
