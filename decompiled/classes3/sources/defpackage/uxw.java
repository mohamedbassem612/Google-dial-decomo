package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uxw {
    private static final aimz a = aimz.i("com/android/dialer/util/DialerUtils");

    public static void a(java.lang.AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (java.lang.RuntimeException e) {
                throw e;
            } catch (java.lang.Exception e2) {
                a.bq(a.c(), "Catch ignored exception", "com/android/dialer/util/DialerUtils", "closeQuietly", 'n', "DialerUtils.java", e2, zct.b);
            }
        }
    }

    public static void b(android.content.Context context, android.content.Intent intent, int i) {
        java.lang.String schemeSpecificPart;
        if (intent.getBooleanExtra("IS_EMERGENCY_NUMBER", false)) {
            c(context).b(mce.by);
        }
        if (!"android.intent.action.CALL".equals(intent.getAction())) {
            try {
                wsc.aV(context).jc();
                ahqx.l(context, intent);
                return;
            } catch (android.content.ActivityNotFoundException e) {
                c(context).a(mcd.o);
                a.c().i(zct.b).k(e).m(aioa.c).l("com/android/dialer/util/DialerUtils", "startActivityWithErrorToast", 92, "DialerUtils.java").v("failed to start activity");
                android.widget.Toast.makeText(context, i, 0).show();
                return;
            }
        }
        jxe jxeVarW = wsc.aV(context).W();
        if (!"android.intent.action.CALL".equals(intent.getAction())) {
            throw new java.lang.AssertionError("Intent must have action ACTION_CALL");
        }
        if (((java.lang.Boolean) jxeVarW.g.a()).booleanValue() && (schemeSpecificPart = intent.getData().getSchemeSpecificPart()) != null) {
            j$.util.stream.Stream stream = j$.util.DesugarArrays.stream(jxe.b);
            j$.util.Objects.requireNonNull(schemeSpecificPart);
            if (stream.anyMatch(new jty(schemeSpecificPart, 5))) {
                oko okoVar = jxeVarW.e;
                int iF = okoVar.f();
                int iIntValue = ((java.lang.Integer) okoVar.r().orElseThrow(new iaz(3))).intValue();
                if (iF == 13 && iIntValue == 2) {
                    j$.util.Optional optionalA = jxe.a(intent);
                    jrs jrsVar = new jrs(jxeVarW, 5);
                    if (true == optionalA.isPresent()) {
                        java.lang.Object obj = optionalA.get();
                        agsm.i(185, ((jxe) jrsVar.a).n.i(((java.lang.Long) obj).longValue(), jxn.m), "Emitting event WPS_WARNING_DIALOG_SHOWN failed.", new java.lang.Object[0]);
                    }
                    jxe.a.b().l("com/android/dialer/calllauncher/CallLauncher", "showWpsWarningDialog", 211, "CallLauncher.java").v("showing outgoing WPS dialog before placing call");
                    defpackage.afsn afsnVar = new defpackage.afsn(jxeVarW.c, 0);
                    afsnVar.r(2132019689);
                    afsnVar.w(2132018317, new defpackage.vxd(jxeVarW, context, intent, 1));
                    afsnVar.t(android.R.string.cancel, null);
                    afsnVar.create().show();
                    return;
                }
            }
        }
        jxeVarW.b(context, intent);
    }

    private static zas c(android.content.Context context) {
        return wsc.aV(context).nJ().i((java.lang.String) null);
    }
}
