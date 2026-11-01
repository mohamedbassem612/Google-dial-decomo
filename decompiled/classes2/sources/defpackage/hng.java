package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hng implements defpackage.hqr {
    public final defpackage.hqe a;
    public final ahpz b;
    public final rlv c;
    public final rai d;
    private final android.content.Context e;
    private final gpd f;

    public hng(android.content.Context context, rai raiVar, defpackage.hqe hqeVar, ahpz ahpzVar, rlv rlvVar, gpd gpdVar) {
        aooh.f(context, "appContext");
        aooh.f(raiVar, "favoritesNumberPickerScreenFactory");
        aooh.f(ahpzVar, "traceCreation");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        this.e = context;
        this.d = raiVar;
        this.a = hqeVar;
        this.b = ahpzVar;
        this.c = rlvVar;
        this.f = gpdVar;
    }

    @Override // defpackage.hqw
    public final defpackage.ze a() {
        defpackage.xb xbVar = new defpackage.xb();
        xbVar.a = true;
        return xbVar.a();
    }

    @Override // defpackage.hqw
    public final /* synthetic */ aoxh c(aoxh aoxhVar, defpackage.tt ttVar) {
        return defpackage.hhv.a(this, aoxhVar, ttVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.hqr
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object b(java.util.List list, defpackage.tt ttVar, aoln aolnVar) {
        defpackage.hne hneVar;
        defpackage.xb xbVar;
        aolu aoluVarA;
        if (aolnVar instanceof defpackage.hne) {
            hneVar = (defpackage.hne) aolnVar;
            int i = hneVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hneVar.c = i - Integer.MIN_VALUE;
            } else {
                hneVar = new defpackage.hne(this, aolnVar);
            }
        } else {
            hneVar = new defpackage.hne(this, aolnVar);
        }
        java.lang.Object obj = hneVar.a;
        aolu aoluVar = aolu.a;
        int i2 = hneVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            if (list.isEmpty()) {
                aoluVarA = new defpackage.xo(androidx.car.app.model.CarText.create(dvx.e(this.e, 2132018539))).a();
                aoluVar = aoluVarA;
                f(mce.gs);
            } else {
                defpackage.xb xbVar2 = new defpackage.xb();
                hneVar.d = xbVar2;
                hneVar.c = 1;
                java.lang.Object objE = e(list, ttVar, hneVar);
                if (objE != aoluVar) {
                    obj = objE;
                    xbVar = xbVar2;
                }
            }
            return aoluVar;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        xbVar = hneVar.d;
        aooc.af(obj);
        xbVar.b = (androidx.car.app.model.ItemList) j$.util.Objects.requireNonNull((androidx.car.app.model.ItemList) obj);
        xbVar.g = 2;
        aoluVarA = xbVar.a();
        aoluVar = aoluVarA;
        f(mce.gs);
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0050  */
    /* JADX WARN: Code duplicated, block: B:19:0x006b  */
    /* JADX WARN: Code duplicated, block: B:20:0x006f  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:26:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:28:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:29:0x010c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0114  */
    /* JADX WARN: Code duplicated, block: B:34:0x011b  */
    /* JADX WARN: Code duplicated, block: B:35:0x011d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0130  */
    /* JADX WARN: Code duplicated, block: B:43:0x013c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0130 -> B:42:0x0133). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object e(java.util.List r11, defpackage.tt r12, aoln r13) {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hng.e(java.util.List, tt, aoln):java.lang.Object");
    }

    public final void f(mce mceVar) {
        this.f.i((java.lang.String) null).b(mceVar);
    }
}
