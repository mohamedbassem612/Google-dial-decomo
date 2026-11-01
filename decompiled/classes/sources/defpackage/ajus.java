package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class ajus implements defpackage.ajtr {
    private final /* synthetic */ int $cid;

    public /* synthetic */ ajus(int i) {
        this.$cid = i;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ajtz */
    @Override // defpackage.ajtr
    public final java.lang.Object a(defpackage.ajtq ajtqVar) throws ajtz {
        switch (this.$cid) {
            case 0:
                return (java.util.concurrent.ScheduledExecutorService) com.google.firebase.concurrent.ExecutorsRegistrar.c.a();
            case 1:
                return (java.util.concurrent.ScheduledExecutorService) com.google.firebase.concurrent.ExecutorsRegistrar.a.a();
            case 2:
                return (java.util.concurrent.ScheduledExecutorService) com.google.firebase.concurrent.ExecutorsRegistrar.b.a();
            case 3:
                return defpackage.ajuv.INSTANCE;
            case 4:
                return com.google.firebase.datatransport.TransportRegistrar.lambda$getComponents$0(ajtqVar);
            case 5:
                return com.google.firebase.datatransport.TransportRegistrar.lambda$getComponents$1(ajtqVar);
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return com.google.firebase.datatransport.TransportRegistrar.lambda$getComponents$2(ajtqVar);
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return com.google.firebase.iid.Registrar.lambda$getComponents$0(ajtqVar);
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return com.google.firebase.iid.Registrar.lambda$getComponents$1(ajtqVar);
            case 9:
                return com.google.firebase.installations.FirebaseInstallationsRegistrar.lambda$getComponents$0(ajtqVar);
            default:
                java.util.Set setS = defpackage.ajsz.s(ajtqVar, defpackage.ajyl.class);
                defpackage.ajyk ajykVar = defpackage.ajyk.a;
                if (ajykVar == null) {
                    synchronized (defpackage.ajyk.class) {
                        ajykVar = defpackage.ajyk.a;
                        if (ajykVar == null) {
                            ajykVar = new defpackage.ajyk();
                            defpackage.ajyk.a = ajykVar;
                        }
                        break;
                    }
                }
                return new defpackage.ajyj(setS, ajykVar);
        }
    }
}
