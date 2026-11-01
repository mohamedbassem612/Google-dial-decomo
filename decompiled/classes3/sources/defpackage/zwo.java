package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zwo implements zwp {
    final /* synthetic */ java.lang.String a;
    final /* synthetic */ android.content.Context b;

    public zwo(java.lang.String str, android.content.Context context) {
        this.a = str;
        this.b = context;
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
        android.os.Parcel parcelEP = yruVar.eP();
        parcelEP.writeString(str);
        android.os.Parcel parcelEQ = yruVar.eQ(8, parcelEP);
        android.os.Bundle bundle = (android.os.Bundle) yld.a(parcelEQ, android.os.Bundle.CREATOR);
        parcelEQ.recycle();
        zwq.j(bundle);
        java.lang.String string = bundle.getString("Error");
        android.content.Intent intent = (android.content.Intent) dpe.t(bundle, "userRecoveryIntent", android.content.Intent.class);
        android.app.PendingIntent pendingIntent = (android.app.PendingIntent) dpe.t(bundle, "userRecoveryPendingIntent", android.app.PendingIntent.class);
        if (defpackage.zyu.SUCCESS.equals(defpackage.zyu.a(string))) {
            return java.lang.Boolean.TRUE;
        }
        zwq.g(this.b, "requestGoogleAccountsAccess", string, intent, pendingIntent);
        throw new zwj("Invalid state. Shouldn't happen");
    }
}
