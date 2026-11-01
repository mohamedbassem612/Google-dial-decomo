package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hpf implements defpackage.hqs {
    private static final java.util.List c = ajsz.bb(new zmw[]{zmw.d, zmw.c, zmw.a});
    public final zms a;
    public final zmq b;
    private final aoxh d;
    private final zpm e;

    public hpf(hpy hpyVar, zms zmsVar, zmq zmqVar, zpm zpmVar) {
        aooh.f(hpyVar, "carInCallUpdateListener");
        aooh.f(zmsVar, "audioModeProvider");
        aooh.f(zpmVar, "callScopes");
        this.a = zmsVar;
        this.b = zmqVar;
        this.e = zpmVar;
        this.d = aoxo.a(new defpackage.hlh(hpyVar.a, this, 6));
    }

    @Override // defpackage.hqs
    public final aoxh a() {
        return this.d;
    }

    public final java.util.List b(zms zmsVar) {
        java.util.List list = c;
        java.util.ArrayList<zmw> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (zmsVar.c().contains((zmw) obj)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(ajsz.bl(arrayList, 10));
        for (zmw zmwVar : arrayList) {
            arrayList2.add(new defpackage.hpb(zmwVar, zmsVar.a() == zmwVar, new defpackage.hpc(this, zmwVar, 0)));
        }
        return arrayList2;
    }

    public final java.util.List c(zms zmsVar) {
        aihd aihdVarB = zmsVar.b();
        aooh.e(aihdVarB, "getSupportedBluetoothDevices(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(aihdVarB, 10));
        java.util.Iterator it = aihdVarB.iterator();
        while (true) {
            int i = 1;
            if (!it.hasNext()) {
                return ajsz.bX(ajsz.bZ(arrayList), new defpackage.hte(1));
            }
            android.bluetooth.BluetoothDevice bluetoothDevice = (android.bluetooth.BluetoothDevice) it.next();
            j$.util.Optional optionalE = zmsVar.e(bluetoothDevice);
            aooh.e(optionalE, "getBluetoothDeviceAliasName(...)");
            java.lang.String str = (java.lang.String) aooh.q(optionalE);
            j$.util.Optional optionalD = zmsVar.d();
            aooh.e(optionalD, "getActiveBluetoothDevice(...)");
            arrayList.add(new defpackage.hpk(str, aooh.n(aooh.q(optionalD), bluetoothDevice), bluetoothDevice, new defpackage.hpc(this, bluetoothDevice, i, null)));
        }
    }

    public final qbe d() {
        defpackage.hpd hpdVar;
        j$.util.Optional optionalH = this.e.h();
        aooh.e(optionalH, "getPrimaryCallScope(...)");
        apqr apqrVar = (apqr) aooh.q(optionalH);
        if (apqrVar == null || (hpdVar = (defpackage.hpd) apqrVar.a(defpackage.hpd.class)) == null) {
            return null;
        }
        return hpdVar.cp();
    }
}
