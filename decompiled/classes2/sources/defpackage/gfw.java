package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class gfw extends aoof implements aonn {
    private final /* synthetic */ int $cid;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gfw(java.lang.Object obj, int i, byte[] bArr) {
        super(2, obj, defpackage.dqp.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0);
        this.$cid = i;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        boolean zB;
        unc uncVar = null;
        switch (this.$cid) {
            case 0:
                return gfz.b((gfy) this.e, (aonj) obj, (aoln) obj2);
            case 1:
                cpe cpeVar = (cpe) obj;
                cpe cpeVar2 = (cpe) obj2;
                defpackage.dqp dqpVar = (defpackage.dqp) this.e;
                if (((cmv) dqpVar).D && (zB = cpeVar2.b()) != cpeVar.b()) {
                    if (zB) {
                        unc uncVarB = dqpVar.b();
                        if (uncVarB != null) {
                            uncVarB.d();
                            uncVar = uncVarB;
                        }
                        dqpVar.a = uncVar;
                    } else {
                        bek bekVar = dqpVar.a;
                        if (bekVar != null) {
                            bekVar.a();
                        }
                        dqpVar.a = null;
                    }
                }
                return aojh.a;
            case 2:
                ((android.os.Bundle) this.e).putString((java.lang.String) obj, (java.lang.String) obj2);
                return aojh.a;
            case 3:
                ((android.os.Bundle) this.e).putLong((java.lang.String) obj, ((java.lang.Number) obj2).longValue());
                return aojh.a;
            case 4:
                ((android.os.Bundle) this.e).putBoolean((java.lang.String) obj, ((java.lang.Boolean) obj2).booleanValue());
                return aojh.a;
            case 5:
                int iIntValue = ((java.lang.Number) obj).intValue();
                int iIntValue2 = ((java.lang.Number) obj2).intValue();
                uoo uooVar = (uoo) this.e;
                java.lang.String[] strArr = uoo.a;
                unc uncVarB2 = uooVar.b();
                uncVar = uncVarB2 instanceof unc ? uncVarB2 : null;
                if (uncVar != null) {
                    java.util.List listCb = ajsz.cb(uncVar.a);
                    listCb.add(iIntValue2, listCb.remove(iIntValue));
                    unc uncVarB3 = uooVar.b();
                    aooh.d(uncVarB3, "null cannot be cast to non-null type com.android.dialer.speeddial.bar.impl.controller.FavoritesBarUiModel.Data");
                    unc uncVar2 = uncVarB3;
                    uooVar.c(new unc(listCb, uncVar2.b, uncVar2.c));
                }
                return aojh.a;
            case 6:
                ((android.app.Activity) this.e).setResult(((java.lang.Number) obj).intValue(), (android.content.Intent) obj2);
                return aojh.a;
            default:
                return ((abxm) this.e).a((aoln) obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gfw(java.lang.Object obj, int i) {
        super(2, obj, gfz.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gfw(java.lang.Object obj, int i, char[] cArr) {
        super(2, obj, android.os.Bundle.class, "putString", "putString(Ljava/lang/String;Ljava/lang/String;)V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gfw(java.lang.Object obj, int i, short[] sArr) {
        super(2, obj, android.os.Bundle.class, "putLong", "putLong(Ljava/lang/String;J)V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gfw(java.lang.Object obj, int i, int[] iArr) {
        super(2, obj, android.os.Bundle.class, "putBoolean", "putBoolean(Ljava/lang/String;Z)V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gfw(java.lang.Object obj, int i, boolean[] zArr) {
        super(2, obj, uoo.class, "onMove", "onMove(II)V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gfw(java.lang.Object obj, int i, float[] fArr) {
        super(2, obj, android.app.Activity.class, "setResult", "setResult(ILandroid/content/Intent;)V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gfw(java.lang.Object obj, int i, byte[][] bArr) {
        super(2, obj, abxm.class, "getMyCallingCardAccount", "getMyCallingCardAccount(Lcom/google/android/libraries/dialer/patrick/account/CallingCardAccountGrpcRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.$cid = i;
    }
}
