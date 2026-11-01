package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pgc extends amzm {
    private final amzg b;

    public pgc(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new defpackage.amzw(defpackage.pgc.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        zms zmsVar = (zms) obj;
        j$.util.Optional optionalD = zmsVar.d();
        j$.util.Objects.requireNonNull(zmsVar);
        nzu nzuVar = new nzu(zmsVar, 19);
        if (true == optionalD.isPresent()) {
            java.lang.Object obj2 = optionalD.get();
            optionalD = ((zms) nzuVar.a).e((android.bluetooth.BluetoothDevice) obj2);
            optionalD.getClass();
        }
        return aiql.z(optionalD);
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
