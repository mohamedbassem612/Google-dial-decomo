package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kdd {
    private static final defpackage.aimz c = defpackage.aimz.i("com/android/dialer/calllog/contentloader/CallLogUiModelAdapter");
    public final defpackage.aolr a;
    public final defpackage.aoin b;
    private final defpackage.aoss d;
    private final defpackage.aoir e;
    private final defpackage.aoir f;

    public kdd(defpackage.aoss aossVar, defpackage.aolr aolrVar, defpackage.aoin aoinVar, defpackage.zzx zzxVar, defpackage.zzx zzxVar2) {
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        if (aolrVar == null) {
            defpackage.aooh.i("lightweightContext");
        }
        this.d = aossVar;
        this.a = aolrVar;
        this.b = aoinVar;
        this.e = new defpackage.aoiy(new defpackage.jza(zzxVar, 8));
        this.f = new defpackage.aoiy(new defpackage.jza(zzxVar2, 9));
    }

    public final kdc a(defpackage.kiu kiuVar) {
        jyh jyhVar;
        defpackage.aooh.f(kiuVar, "row");
        java.util.List list = (java.util.List) this.e.a();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (true) {
            kie kieVarA = null;
            if (!it.hasNext()) {
                break;
            }
            try {
                kieVarA = ((defpackage.kif) it.next()).a(kiuVar);
            } catch (java.lang.Exception e) {
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) c.d()).k(e)).g(1, java.util.concurrent.TimeUnit.MINUTES)).i(defpackage.zct.b).l("com/android/dialer/calllog/contentloader/CallLogUiModelAdapter", "toCallLogUiModel$<anonymous>", 82, "CallLogUiModelAdapter.kt")).v("exception thrown when producing icon");
            }
            if (kieVarA != null) {
                arrayList.add(kieVarA);
            }
        }
        java.util.List<defpackage.aoiu> list2 = (java.util.List) this.f.a();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (defpackage.aoiu aoiuVar : list2) {
            jyf jyfVar = (jyf) aoiuVar.a;
            try {
                jyd jydVarA = ((jye) aoiuVar.b).a(kiuVar);
                jyhVar = jydVarA != null ? new jyh(jydVarA, jyfVar) : null;
            } catch (java.lang.Exception e2) {
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) c.d()).k(e2)).g(1, java.util.concurrent.TimeUnit.MINUTES)).i(defpackage.zct.b).l("com/android/dialer/calllog/contentloader/CallLogUiModelAdapter", "toCallLogUiModel$<anonymous>", 98, "CallLogUiModelAdapter.kt")).v("exception thrown when producing chip");
            }
            if (jyhVar != null) {
                arrayList2.add(jyhVar);
            }
        }
        return new kdc(kiuVar, arrayList, arrayList2);
    }

    public final defpackage.ajcq b(java.util.List list) {
        defpackage.aooh.f(list, "coalescedRows");
        return defpackage.aosv.F(this.d, 0, new jpj(this, list, (defpackage.aoln) null, 10), 3);
    }

    public final defpackage.ajcq c(java.util.List list) {
        defpackage.aooh.f(list, "coalescedRows");
        return defpackage.aosv.F(this.d, 0, new jpj(this, list, (defpackage.aoln) null, 11, (byte[]) null), 3);
    }
}
