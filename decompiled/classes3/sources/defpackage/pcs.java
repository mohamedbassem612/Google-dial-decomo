package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pcs extends amzm {
    private final amzg b;
    private final amzg c;

    public pcs(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.pcs.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, vzo] */
    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        aify aifyVarBv;
        defpackage.uzx uzxVar;
        java.util.List list = (java.util.List) obj;
        zms zmsVar = (zms) list.get(0);
        zzx zzxVar = (zzx) list.get(1);
        aooh.f(zmsVar, "audioModeProvider");
        aooh.f(zzxVar, "bluetoothCallAudioDeviceFilters");
        if (zmsVar.c().contains(defpackage.zmw.ROUTE_BLUETOOTH)) {
            aihd aihdVarB = zmsVar.b();
            aooh.e(aihdVarB, "getSupportedBluetoothDevices(...)");
            aify aifyVarBv2 = ahvr.bv(aihdVarB);
            aify aifyVarG = zzxVar.e().g();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : aifyVarBv2) {
                android.bluetooth.BluetoothDevice bluetoothDevice = (android.bluetooth.BluetoothDevice) obj2;
                aooh.c(aifyVarG);
                if (!(aifyVarG instanceof java.util.Collection) || !aifyVarG.isEmpty()) {
                    java.util.Iterator it = aifyVarG.iterator();
                    do {
                        if (it.hasNext()) {
                            uzxVar = (defpackage.uzx) it.next();
                            aooh.c(bluetoothDevice);
                            aooh.f(bluetoothDevice, "bluetoothDevice");
                        }
                    } while (!uzxVar.a.a(bluetoothDevice));
                }
                arrayList.add(obj2);
            }
            aifyVarBv = ahvr.bv(arrayList);
        } else {
            aifyVarBv = aike.a;
            aooh.e(aifyVarBv, "of(...)");
        }
        return aiql.z(aifyVarBv);
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
