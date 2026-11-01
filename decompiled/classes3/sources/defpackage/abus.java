package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abus implements defpackage.abut {
    public static final defpackage.abus a = new defpackage.abus();

    private abus() {
    }

    @Override // defpackage.abuw
    public final com.google.android.gms.people.cpg.callingcard.v2.Identifier a() {
        defpackage.aarq aarqVar = new defpackage.aarq();
        aarqVar.b(3);
        aarqVar.c = new com.google.android.gms.people.cpg.callingcard.v2.AccountInfo(null, null, null);
        return aarqVar.a();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.abus)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 200724734;
    }

    public final java.lang.String toString() {
        return "DeviceAccount";
    }
}
