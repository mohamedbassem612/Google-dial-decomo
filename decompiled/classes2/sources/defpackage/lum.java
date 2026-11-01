package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lum {
    public static final aimz a = aimz.i("com/android/dialer/contactchecker/remote/WearDeviceCoordinator");
    public final android.content.Context b;
    public final zrw c;
    private final aawd d;
    private final aolr e;

    public lum(android.content.Context context, aawd aawdVar, aolr aolrVar, zrw zrwVar) {
        aooh.f(context, "appContext");
        aooh.f(aolrVar, "blockingContext");
        this.b = context;
        this.d = aawdVar;
        this.e = aolrVar;
        this.c = zrwVar;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0069  */
    /* JADX WARN: Code duplicated, block: B:23:0x007d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007d -> B:24:0x007e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(aoln r8) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lum.a(aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(android.bluetooth.BluetoothDevice bluetoothDevice, aoln aolnVar) {
        defpackage.lul lulVar;
        if (aolnVar instanceof defpackage.lul) {
            lulVar = (defpackage.lul) aolnVar;
            int i = lulVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lulVar.c = i - Integer.MIN_VALUE;
            } else {
                lulVar = new defpackage.lul(this, aolnVar);
            }
        } else {
            lulVar = new defpackage.lul(this, aolnVar);
        }
        java.lang.Object objY = lulVar.a;
        aolu aoluVar = aolu.a;
        int i2 = lulVar.c;
        try {
            if (i2 == 0) {
                aooc.af(objY);
                aaum aaumVarA = this.d.a(bluetoothDevice.getAddress());
                lulVar.c = 1;
                objY = aooh.Y(aaumVarA, lulVar);
                if (objY == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objY);
            }
            return java.lang.Boolean.valueOf(((java.lang.String) objY) != null);
        } catch (aacw e) {
            a.b().k(e).l("com/android/dialer/contactchecker/remote/WearDeviceCoordinator", "isWearDevice", 49, "WearDeviceCoordinator.kt").y("Can't confirm the wear device due to caught exception with status: %s", e.a);
            return java.lang.Boolean.FALSE;
        } catch (aado e2) {
            a.b().k(e2).l("com/android/dialer/contactchecker/remote/WearDeviceCoordinator", "isWearDevice", 55, "WearDeviceCoordinator.kt").y("Can't confirm the wear device due to caught exception with status: %s", e2.getMessage());
            return java.lang.Boolean.FALSE;
        }
    }
}
