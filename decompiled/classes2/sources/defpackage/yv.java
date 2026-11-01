package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class yv {
    public static final android.view.ActionMode a(android.view.View view, defpackage.bhm bhmVar) {
        return view.startActionMode(new defpackage.bhv(bhmVar), 1);
    }

    public static final void b(android.app.PendingIntent pendingIntent) throws android.app.PendingIntent.CanceledException {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            defpackage.yt.c(pendingIntent);
        } else {
            pendingIntent.send();
        }
    }

    public static final void c(android.content.Context context, android.view.textclassifier.TextClassification textClassification) throws android.app.PendingIntent.CanceledException {
        java.lang.String strM = rs$.ExternalSyntheticApiModelOutline0.m(textClassification);
        b(android.app.PendingIntent.getActivity(context, strM != null ? strM.hashCode() : 0, aa$.ExternalSyntheticApiModelOutline0.m(textClassification), 201326592));
    }

    public static boolean d(dyr dyrVar, android.view.KeyEvent keyEvent) {
        if (dyrVar == null) {
            return false;
        }
        return dyrVar.h(keyEvent);
    }

    public static defpackage.dzb e(android.view.Display display, int i) {
        android.view.RoundedCorner roundedCornerM;
        int i2;
        defpackage.dzb dzbVar = null;
        if (android.os.Build.VERSION.SDK_INT >= 31 && (roundedCornerM = rk$.ExternalSyntheticApiModelOutline0.m(display, i)) != null) {
            int iM = rk$.ExternalSyntheticApiModelOutline0.m(roundedCornerM);
            if (iM != 0) {
                i2 = 1;
                if (iM != 1) {
                    i2 = 2;
                    if (iM != 2) {
                        i2 = 3;
                        if (iM != 3) {
                            throw new java.lang.IllegalArgumentException(a.bj(iM, "Invalid position: "));
                        }
                    }
                }
            } else {
                i2 = 0;
            }
            int iM2 = ac$.ExternalSyntheticApiModelOutline0.m(roundedCornerM);
            android.graphics.Point pointM = rk$.ExternalSyntheticApiModelOutline0.m(roundedCornerM);
            dzbVar = new defpackage.dzb(i2, iM2, pointM.x, pointM.y);
        }
        return dzbVar;
    }

    public static android.text.Spanned f(java.lang.String str) {
        return fh$.ExternalSyntheticApiModelOutline0.m(str, 0);
    }
}
