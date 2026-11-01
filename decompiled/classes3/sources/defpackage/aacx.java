package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aacx extends java.lang.Exception {
    private final aca a;

    public aacx(aca acaVar) {
        this.a = acaVar;
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        aca acaVar = this.a;
        boolean z = true;
        for (aadx aadxVar : acaVar.keySet()) {
            com.google.android.gms.common.ConnectionResult connectionResult = (com.google.android.gms.common.ConnectionResult) acaVar.get(aadxVar);
            aais.as(connectionResult);
            z &= !connectionResult.d();
            arrayList.add(aadxVar.a() + ": " + connectionResult.toString());
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (z) {
            sb.append("None of the queried APIs are available. ");
        } else {
            sb.append("Some of the queried APIs are unavailable. ");
        }
        sb.append(android.text.TextUtils.join("; ", arrayList));
        return sb.toString();
    }
}
