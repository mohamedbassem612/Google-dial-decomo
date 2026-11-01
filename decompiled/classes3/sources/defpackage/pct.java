package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pct extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public pct(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.pct.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00bd  */
    /* JADX WARN: Type inference failed for: r6v18, types: [aonj, java.lang.Object] */
    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        boolean z;
        java.util.List list = (java.util.List) obj;
        android.content.Context context = (android.content.Context) list.get(0);
        zms zmsVar = (zms) list.get(1);
        aify aifyVar = (aify) list.get(2);
        aooh.f(context, "appContext");
        aooh.f(zmsVar, "audioModeProvider");
        aooh.f(aifyVar, "bluetoothDevicesEligibleForAudioTransfer");
        aift aiftVar = new aift(4);
        aihd aihdVarC = zmsVar.c();
        defpackage.zmw zmwVar = defpackage.zmw.ROUTE_BLUETOOTH;
        if (aihdVarC.contains(zmwVar)) {
            if (aifyVar.isEmpty()) {
                aiftVar.i(pez.k(zmwVar, context, zmsVar));
            } else {
                ailk ailkVarY = aifyVar.y(0);
                aooh.e(ailkVarY, "iterator(...)");
                while (ailkVarY.hasNext()) {
                    android.bluetooth.BluetoothDevice bluetoothDevice = (android.bluetooth.BluetoothDevice) ailkVarY.next();
                    j$.util.Optional optionalD = zmsVar.d();
                    aooh.e(optionalD, "getActiveBluetoothDevice(...)");
                    defpackage.zmu zmuVar = new defpackage.zmu();
                    zmuVar.a = zmwVar;
                    zmuVar.b(j$.util.Optional.of(bluetoothDevice));
                    zmuVar.c(zmsVar.e(bluetoothDevice));
                    if (zmsVar.a() == zmwVar && optionalD.isPresent()) {
                        nzu nzuVar = new nzu(new opy(bluetoothDevice, 11), 18);
                        if (true == optionalD.isPresent()) {
                            optionalD = j$.util.Optional.ofNullable(a.k((aonj) nzuVar.a, optionalD.get()));
                        }
                        aooh.e(optionalD, "map(...)");
                        if (((java.lang.Boolean) aooh.p(optionalD, java.lang.Boolean.FALSE)).booleanValue()) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    zmuVar.d(j$.util.Optional.of(java.lang.Boolean.valueOf(z)));
                    aiftVar.i(zmuVar.a());
                }
            }
        }
        defpackage.zmw zmwVar2 = defpackage.zmw.ROUTE_SPEAKER;
        if (aihdVarC.contains(zmwVar2)) {
            aiftVar.i(pez.k(zmwVar2, context, zmsVar));
        }
        defpackage.zmw zmwVar3 = defpackage.zmw.ROUTE_WIRED_HEADSET;
        if (aihdVarC.contains(zmwVar3)) {
            aiftVar.i(pez.k(zmwVar3, context, zmsVar));
        }
        defpackage.zmw zmwVar4 = defpackage.zmw.ROUTE_EARPIECE;
        if (aihdVarC.contains(zmwVar4)) {
            aiftVar.i(pez.k(zmwVar4, context, zmsVar));
        }
        aify aifyVarH = aiftVar.h();
        aooh.e(aifyVarH, "build(...)");
        return aiql.z(aifyVarH);
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
