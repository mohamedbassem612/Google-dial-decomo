package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class onm extends amzm {
    private final amzg b;
    private final amzg c;

    public onm(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new amzw(defpackage.onm.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        j$.util.Optional optionalOf;
        int i;
        defpackage.aayy aayyVar;
        java.util.List list = (java.util.List) obj;
        boolean zBooleanValue = ((java.lang.Boolean) list.get(0)).booleanValue();
        android.telecom.Call.Details details = (android.telecom.Call.Details) list.get(1);
        if (zBooleanValue) {
            android.os.Bundle extras = details.getExtras();
            if (extras == null) {
                hgb.c(defpackage.onl.a.d(), "No extra bundle found for Fides call state", "com/android/dialer/fides/impl/FidesStateProducerModule", "produceFidesCallState", 'M', "FidesStateProducerModule.java", (byte) 1, java.util.concurrent.TimeUnit.MINUTES);
                optionalOf = j$.util.Optional.of(defpackage.aayy.UNKNOWN);
            } else {
                if (extras.containsKey("android.ims.fides_call_state")) {
                    i = extras.getInt("android.ims.fides_call_state");
                } else if (extras.containsKey("com.google.android.ims.fides_call_state")) {
                    i = extras.getInt("com.google.android.ims.fides_call_state");
                } else {
                    hgb.c(defpackage.onl.a.d(), "No Fides call state found in bundle", "com/android/dialer/fides/impl/FidesStateProducerModule", "produceFidesCallState", 'Z', "FidesStateProducerModule.java", (byte) 1, java.util.concurrent.TimeUnit.MINUTES);
                    optionalOf = j$.util.Optional.of(defpackage.aayy.UNKNOWN);
                }
                switch (i) {
                    case 0:
                        aayyVar = defpackage.aayy.UNKNOWN;
                        break;
                    case 1:
                        aayyVar = defpackage.aayy.NOT_ENCRYPTED;
                        break;
                    case 2:
                        aayyVar = defpackage.aayy.ENCRYPTION_OFFERED;
                        break;
                    case 3:
                        aayyVar = defpackage.aayy.ENCRYPTED;
                        break;
                    case 4:
                        aayyVar = defpackage.aayy.REMOTE_RINGING_NONE_SUPPORT_ENCRYPTION;
                        break;
                    case 5:
                        aayyVar = defpackage.aayy.REMOTE_RINGING_ALL_SUPPORT_ENCRYPTION;
                        break;
                    case 6:
                        aayyVar = defpackage.aayy.REMOTE_RINGING_SOME_SUPPORT_ENCRYPTION;
                        break;
                    default:
                        aayyVar = null;
                        break;
                }
                if (aayyVar == null) {
                    defpackage.onl.a.d().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/fides/impl/FidesStateProducerModule", "produceFidesCallState", 98, "FidesStateProducerModule.java").w("Unknown Fides call state %d", i);
                    optionalOf = j$.util.Optional.of(defpackage.aayy.UNKNOWN);
                } else {
                    optionalOf = j$.util.Optional.of(aayyVar);
                }
            }
        } else {
            optionalOf = j$.util.Optional.empty();
        }
        return aiql.z(optionalOf);
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
