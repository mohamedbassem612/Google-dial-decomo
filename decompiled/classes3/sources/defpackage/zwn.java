package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class zwn implements zwp {
    final /* synthetic */ java.lang.String a;
    final /* synthetic */ android.os.Bundle b;

    public zwn(java.lang.String str, android.os.Bundle bundle) {
        this.a = str;
        this.b = bundle;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: zwj */
    public final /* bridge */ /* synthetic */ java.lang.Object a(android.os.IBinder iBinder) throws zwj {
        ylb yruVar;
        if (iBinder == null) {
            yruVar = null;
        } else {
            ylb ylbVarQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
            yruVar = ylbVarQueryLocalInterface instanceof yru ? (yru) ylbVarQueryLocalInterface : new yru(iBinder);
        }
        java.lang.String str = this.a;
        android.os.Bundle bundle = this.b;
        android.os.Parcel parcelEP = yruVar.eP();
        parcelEP.writeString(str);
        yld.d(parcelEP, bundle);
        android.os.Parcel parcelEQ = yruVar.eQ(2, parcelEP);
        android.os.Bundle bundle2 = (android.os.Bundle) yld.a(parcelEQ, android.os.Bundle.CREATOR);
        parcelEQ.recycle();
        zwq.j(bundle2);
        java.lang.String string = bundle2.getString("Error");
        if (bundle2.getBoolean("booleanResult")) {
            return null;
        }
        throw new zwj(string);
    }
}
