package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lwd extends aomh implements aono {
    int a;
    /* synthetic */ java.lang.Object b;
    final /* synthetic */ defpackage.lwf c;
    final /* synthetic */ defpackage.qa d;
    final /* synthetic */ tei e;
    private /* synthetic */ java.lang.Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lwd(aoln aolnVar, defpackage.lwf lwfVar, defpackage.qa qaVar, tei teiVar) {
        super(3, aolnVar);
        this.c = lwfVar;
        this.d = qaVar;
        this.e = teiVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        defpackage.lwd lwdVar = new defpackage.lwd((aoln) obj3, this.c, this.d, this.e);
        lwdVar.f = (aoxi) obj;
        lwdVar.b = obj2;
        return lwdVar.b(aojh.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [aoxi] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public final java.lang.Object b(java.lang.Object obj) {
        java.util.List list;
        ?? r1;
        edg gdcVar;
        aolu aoluVar = aolu.a;
        ?? r2 = this.a;
        try {
            if (r2 != 0) {
                if (r2 != 1) {
                    aooc.af(obj);
                } else {
                    java.lang.Object obj2 = this.f;
                    aooc.af(obj);
                    r2 = obj2;
                }
                return aojh.a;
            }
            aooc.af(obj);
            java.lang.Object obj3 = this.f;
            defpackage.lwf lwfVar = this.c;
            defpackage.qa qaVar = this.d;
            tei teiVar = this.e;
            this.a = 1;
            obj = aosv.m(new defpackage.lwc(lwfVar, teiVar, qaVar, null), this);
            r2 = obj3;
            if (obj == aoluVar) {
                return aoluVar;
            }
            list = (java.util.List) obj;
            r1 = r2;
        } catch (java.util.concurrent.CancellationException e) {
            throw e;
        } catch (java.lang.Exception e2) {
            defpackage.lwf.a.c().k(e2).l("com/android/dialer/contactsearch/ContactsAppSearchDataSource", "search$<anonymous>$<anonymous>", 124, "ContactsAppSearchDataSource.kt").v("Failed to search contacts using AppSearch, falling back to CP2");
            list = null;
            r1 = r2;
        }
        if (list == null || list.isEmpty()) {
            gdcVar = new gdc(this.c.d.c(this.e), new ipv((aoln) null, 15, (short[][][]) null), 12);
        } else {
            gdcVar = new edg(new tgl(list), 13);
        }
        this.f = null;
        this.a = 2;
        if (aoov.aG((aoxi) r1, gdcVar, this) == aoluVar) {
            return aoluVar;
        }
        return aojh.a;
    }
}
