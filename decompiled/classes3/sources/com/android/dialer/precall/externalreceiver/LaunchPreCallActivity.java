package com.android.dialer.precall.externalreceiver;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class LaunchPreCallActivity extends android.app.Activity {
    private static final aimz a = aimz.i("com/android/dialer/precall/externalreceiver/LaunchPreCallActivity");
    private static final aify b = aify.v("android.telecom.extra.START_CALL_WITH_VIDEO_STATE", "android.telecom.extra.OUTGOING_CALL_EXTRAS", "android.telecom.extra.PHONE_ACCOUNT_HANDLE", "android.telecom.extra.CALL_SUBJECT", "phone_account_handle", "is_video_call", "call_subject", "allow_assisted_dial");

    private final void a(mce mceVar) {
        defpackage.sns.y(this).nJ().i((java.lang.String) null).b(mceVar);
    }

    @Override // android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        ahoq ahoqVarW = ahvr.W(837, "LaunchPreCallActivity_onCreate");
        try {
            super.onCreate(bundle);
            stv stvVarY = defpackage.sns.y(this);
            rlv rlvVarBt = stvVarY.bt();
            android.content.Intent intent = getIntent();
            boolean booleanExtra = intent.getBooleanExtra("is_video_call", false);
            if (bundle == null && !booleanExtra) {
                a(mce.bt);
            }
            if (bundle == null && booleanExtra) {
                a(mce.dB);
            }
            rlvVarBt.n(rmw.fV);
            if (stvVarY.be().X(intent.getData().getSchemeSpecificPart())) {
                a.d().i(zct.b).l("com/android/dialer/precall/externalreceiver/LaunchPreCallActivity", "onCreate", 112, "LaunchPreCallActivity.java").v("External apps are not allowed to make emergency calls. Aborting call.");
                a(mce.bw);
                finish();
            } else {
                defpackage.amdx amdxVar = new defpackage.amdx(null, null, null);
                android.net.Uri data = intent.getData();
                aooh.f(data, "number");
                defpackage.zoe zoeVarCi = aehj.ci(((alad) amdxVar.a).p());
                java.lang.String string = data.toString();
                aooh.e(string, "toString(...)");
                zoeVarCi.e(string);
                amdxVar.a = zoeVarCi.a();
                amdxVar.v(13);
                android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) intent.getParcelableExtra("phone_account_handle");
                if (phoneAccountHandle == null) {
                    phoneAccountHandle = (android.telecom.PhoneAccountHandle) intent.getParcelableExtra("android.telecom.extra.PHONE_ACCOUNT_HANDLE");
                }
                amdxVar.r(phoneAccountHandle);
                amdxVar.q(booleanExtra);
                amdxVar.n(intent.getStringExtra("call_subject"));
                amdxVar.l(intent.getBooleanExtra("allow_assisted_dial", true));
                amdxVar.u(true != intent.getBooleanExtra("is_number_blocked", false) ? 5 : 4);
                amdxVar.o((defpackage.abvz) defpackage.abwc.c(intent.getBundleExtra("android.telecom.extra.OUTGOING_CALL_EXTRAS")).orElse((java.lang.Object) null));
                android.os.Bundle extras = intent.getExtras();
                if (extras != null) {
                    android.os.Bundle bundle2 = new android.os.Bundle();
                    bundle2.putAll(extras);
                    if (extras.containsKey("android.telecom.extra.START_CALL_WITH_VIDEO_STATE")) {
                        int i = extras.getInt("android.telecom.extra.START_CALL_WITH_VIDEO_STATE");
                        if (i == 0) {
                            amdxVar.q(false);
                        } else if (i == 1 || i == 2) {
                            a.d().l("com/android/dialer/precall/externalreceiver/LaunchPreCallActivity", "filterExtras", 177, "LaunchPreCallActivity.java").w("unsupported video state %d, overriding to STATE_BIDIRECTIONAL", i);
                            amdxVar.q(true);
                        } else if (i != 3) {
                            a.d().l("com/android/dialer/precall/externalreceiver/LaunchPreCallActivity", "filterExtras", 182, "LaunchPreCallActivity.java").w("unknown video state %d", i);
                            amdxVar.q(false);
                        } else {
                            amdxVar.q(true);
                        }
                    }
                    if (extras.containsKey("android.telecom.extra.OUTGOING_CALL_EXTRAS")) {
                        android.os.Bundle bundle3 = extras.getBundle("android.telecom.extra.OUTGOING_CALL_EXTRAS");
                        java.lang.Object obj = amdxVar.a;
                        if (bundle3 == null) {
                            defpackage.zoe zoeVarCi2 = aehj.ci(((alad) obj).p());
                            defpackage.uzx uzxVarCu = aehj.cu(zoeVarCi2.b().p());
                            java.lang.Object obj2 = uzxVarCu.a;
                            ((akzx) obj2).u();
                            defpackage.zsf zsfVar = (defpackage.zsf) ((akzx) obj2).b;
                            zsfVar.b &= -257;
                            zsfVar.m = defpackage.zsf.a.m;
                            zoeVarCi2.d(uzxVarCu.T());
                            amdxVar.a = zoeVarCi2.a();
                        } else {
                            defpackage.zoe zoeVarCi3 = aehj.ci(((alad) obj).p());
                            defpackage.uzx uzxVarCu2 = aehj.cu(zoeVarCi3.b().p());
                            android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                            aooh.e(parcelObtain, "obtain(...)");
                            parcelObtain.writeBundle(bundle3);
                            akzc akzcVarU = akzc.u(parcelObtain.marshall());
                            aooh.e(akzcVarU, "copyFrom(...)");
                            aooh.f(akzcVarU, "value");
                            java.lang.Object obj3 = uzxVarCu2.a;
                            ((akzx) obj3).u();
                            defpackage.zsf zsfVar2 = (defpackage.zsf) ((akzx) obj3).b;
                            j$.util.Objects.requireNonNull(akzcVarU);
                            zsfVar2.b |= 256;
                            zsfVar2.m = akzcVarU;
                            parcelObtain.recycle();
                            zoeVarCi3.d(uzxVarCu2.T());
                            amdxVar.a = zoeVarCi3.a();
                        }
                    }
                    if (extras.containsKey("android.telecom.extra.PHONE_ACCOUNT_HANDLE")) {
                        amdxVar.r((android.telecom.PhoneAccountHandle) extras.getParcelable("android.telecom.extra.PHONE_ACCOUNT_HANDLE"));
                    }
                    if (extras.containsKey("android.telecom.extra.CALL_SUBJECT")) {
                        amdxVar.n(extras.getString("android.telecom.extra.CALL_SUBJECT"));
                    }
                    aike aikeVar = b;
                    int i2 = aikeVar.d;
                    for (int i3 = 0; i3 < i2; i3++) {
                        bundle2.remove((java.lang.String) aikeVar.get(i3));
                    }
                    defpackage.zoe zoeVarCi4 = aehj.ci(((alad) amdxVar.a).p());
                    defpackage.uzx uzxVarCu3 = aehj.cu(zoeVarCi4.b().p());
                    android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                    aooh.e(parcelObtain2, "obtain(...)");
                    parcelObtain2.writeBundle(bundle2);
                    akzc akzcVarU2 = akzc.u(parcelObtain2.marshall());
                    aooh.e(akzcVarU2, "copyFrom(...)");
                    aooh.f(akzcVarU2, "value");
                    java.lang.Object obj4 = uzxVarCu3.a;
                    ((akzx) obj4).u();
                    defpackage.zsf zsfVar3 = (defpackage.zsf) ((akzx) obj4).b;
                    j$.util.Objects.requireNonNull(akzcVarU2);
                    zsfVar3.b |= 512;
                    zsfVar3.n = akzcVarU2;
                    parcelObtain2.recycle();
                    zoeVarCi4.d(uzxVarCu3.T());
                    amdxVar.a = zoeVarCi4.a();
                }
                stvVarY.oW().w((defpackage.zrx) amdxVar.a);
                finish();
            }
            ahoqVarW.close();
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
                throw th;
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
