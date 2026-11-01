package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aaxg extends ylc implements android.os.IInterface {
    private final java.lang.Object a;
    private defpackage.aaxa b;
    private defpackage.aawu c;

    public aaxg() {
        super("com.google.android.gms.wearable.internal.IChannelStreamCallbacks");
        this.a = new java.lang.Object();
    }

    protected final boolean F(int i, android.os.Parcel parcel, android.os.Parcel parcel2) {
        defpackage.aaxa aaxaVar;
        defpackage.aawu aawuVar;
        if (i != 2) {
            return false;
        }
        int i2 = parcel.readInt();
        int i3 = parcel.readInt();
        yld.c(parcel);
        synchronized (this.a) {
            aaxaVar = this.b;
            aawuVar = new defpackage.aawu(i2, i3);
            this.c = aawuVar;
        }
        if (aaxaVar != null) {
            aaxaVar.a(aawuVar);
        }
        parcel2.writeNoException();
        return true;
    }

    public final void a(defpackage.aaxa aaxaVar) {
        defpackage.aawu aawuVar;
        synchronized (this.a) {
            this.b = aaxaVar;
            aawuVar = this.c;
        }
        if (aawuVar != null) {
            aaxaVar.a(aawuVar);
        }
    }
}
