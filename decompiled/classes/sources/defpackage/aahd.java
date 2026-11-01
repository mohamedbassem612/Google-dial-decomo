package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aahd extends defpackage.ylc implements defpackage.aahe {
    private int a;

    protected aahd(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        if (bArr.length != 25) {
            throw new java.lang.IllegalArgumentException();
        }
        this.a = java.util.Arrays.hashCode(bArr);
    }

    public static byte[] d(java.lang.String str) {
        return str.getBytes(java.nio.charset.StandardCharsets.ISO_8859_1);
    }

    @Override // defpackage.ylc
    protected final boolean F(int i, android.os.Parcel parcel, android.os.Parcel parcel2) {
        if (i == 1) {
            aalb aalbVarC = c();
            parcel2.writeNoException();
            defpackage.yld.f(parcel2, aalbVarC);
            return true;
        }
        if (i != 2) {
            return false;
        }
        int i2 = this.a;
        parcel2.writeNoException();
        parcel2.writeInt(i2);
        return true;
    }

    @Override // defpackage.aahe
    public final int b() {
        return this.a;
    }

    @Override // defpackage.aahe
    public final aalb c() {
        return new aala(eO());
    }

    public abstract byte[] eO();

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.aahe)) {
            return false;
        }
        try {
            defpackage.aahe aaheVar = (defpackage.aahe) obj;
            if (aaheVar.b() != this.a) {
                return false;
            }
            return java.util.Arrays.equals(eO(), (byte[]) aala.a(aaheVar.c()));
        } catch (android.os.RemoteException e) {
            android.util.Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            return false;
        }
    }

    public final int hashCode() {
        return this.a;
    }
}
