package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dzr {
    public static defpackage.dyl a(android.view.View view, defpackage.dyl dylVar) {
        android.view.ContentInfo contentInfoM = ac$.ExternalSyntheticApiModelOutline0.m(j$.util.Objects.requireNonNull(dylVar.a.d()));
        android.view.ContentInfo contentInfoM2 = ac$.ExternalSyntheticApiModelOutline0.m(view, contentInfoM);
        if (contentInfoM2 == null) {
            return null;
        }
        return contentInfoM2 != contentInfoM ? new defpackage.dyl(new defpackage.dyi(contentInfoM2)) : dylVar;
    }

    public static java.lang.String[] b(android.view.View view) {
        return ac$.ExternalSyntheticApiModelOutline0.m(view);
    }

    public static void c(android.view.ViewParent viewParent, android.view.View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof dyv) {
            ((dyv) viewParent).d(view, i, i2, iArr, i3);
        } else if (i3 == 0) {
            try {
                viewParent.onNestedPreScroll(view, i, i2, iArr);
            } catch (java.lang.AbstractMethodError e) {
                android.util.Log.e("ViewParentCompat", a.bg(viewParent, "ViewParent ", " does not implement interface method onNestedPreScroll"), e);
            }
        }
    }

    public static void d(android.view.ViewParent viewParent, android.view.View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (viewParent instanceof dyw) {
            ((dyw) viewParent).f(view, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent instanceof dyv) {
            ((dyv) viewParent).e(view, i, i2, i3, i4, i5);
        } else if (i5 == 0) {
            try {
                viewParent.onNestedScroll(view, i, i2, i3, i4);
            } catch (java.lang.AbstractMethodError e) {
                android.util.Log.e("ViewParentCompat", a.bg(viewParent, "ViewParent ", " does not implement interface method onNestedScroll"), e);
            }
        }
    }

    public static void e(android.view.ViewParent viewParent, android.view.View view, android.view.View view2, int i, int i2) {
        if (viewParent instanceof dyv) {
            ((dyv) viewParent).g(view, view2, i, i2);
        } else if (i2 == 0) {
            try {
                viewParent.onNestedScrollAccepted(view, view2, i);
            } catch (java.lang.AbstractMethodError e) {
                android.util.Log.e("ViewParentCompat", a.bg(viewParent, "ViewParent ", " does not implement interface method onNestedScrollAccepted"), e);
            }
        }
    }

    public static void f(android.view.ViewParent viewParent, android.view.View view, int i) {
        if (viewParent instanceof dyv) {
            ((dyv) viewParent).h(view, i);
        } else if (i == 0) {
            try {
                viewParent.onStopNestedScroll(view);
            } catch (java.lang.AbstractMethodError e) {
                android.util.Log.e("ViewParentCompat", a.bg(viewParent, "ViewParent ", " does not implement interface method onStopNestedScroll"), e);
            }
        }
    }

    public static boolean g(android.view.ViewParent viewParent, android.view.View view, float f, float f2, boolean z) {
        try {
            return viewParent.onNestedFling(view, f, f2, z);
        } catch (java.lang.AbstractMethodError e) {
            android.util.Log.e("ViewParentCompat", a.bg(viewParent, "ViewParent ", " does not implement interface method onNestedFling"), e);
            return false;
        }
    }

    public static boolean h(android.view.ViewParent viewParent, android.view.View view, float f, float f2) {
        try {
            return viewParent.onNestedPreFling(view, f, f2);
        } catch (java.lang.AbstractMethodError e) {
            android.util.Log.e("ViewParentCompat", a.bg(viewParent, "ViewParent ", " does not implement interface method onNestedPreFling"), e);
            return false;
        }
    }

    public static boolean i(android.view.ViewParent viewParent, android.view.View view, android.view.View view2, int i, int i2) {
        if (viewParent instanceof dyv) {
            return ((dyv) viewParent).t(view, view2, i, i2);
        }
        if (i2 == 0) {
            try {
                return viewParent.onStartNestedScroll(view, view2, i);
            } catch (java.lang.AbstractMethodError e) {
                android.util.Log.e("ViewParentCompat", a.bg(viewParent, "ViewParent ", " does not implement interface method onStartNestedScroll"), e);
            }
        }
        return false;
    }

    public static final java.lang.Exception j(java.lang.String str, java.lang.Exception exc) {
        int i;
        try {
            java.lang.reflect.Method method = java.lang.Class.forName("android.os.SystemProperties").getMethod("get", java.lang.String.class, java.lang.String.class);
            aooh.e(method, "getMethod(...)");
            try {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                aooh.e(parcelObtain, "obtain(...)");
                android.os.Process.myUserHandle().writeToParcel(parcelObtain, 0);
                parcelObtain.setDataPosition(0);
                i = parcelObtain.readInt();
            } catch (java.lang.Throwable unused) {
                android.util.Log.d("DirectBootExceptionUtil", "Error when reading current user id. Selected default user id `0`.");
                i = 0;
            }
            java.lang.Object objInvoke = method.invoke(null, a.bs(i, "sys.user.", ".ce_available"), "false");
            aooh.d(objInvoke, "null cannot be cast to non-null type kotlin.String");
            if (!aooh.n((java.lang.String) objInvoke, "true")) {
                if (str != null) {
                    java.io.File file = new java.io.File(str, "siblingTestFile.txt");
                    if (file.exists()) {
                        file.delete();
                    }
                    try {
                        try {
                            file.createNewFile();
                        } catch (java.io.IOException unused2) {
                            exc = new defpackage.eek(exc);
                        }
                    } finally {
                        file.delete();
                    }
                }
            }
        } catch (java.lang.Throwable th) {
            aoil.b(exc, th);
        }
        return exc;
    }

    public static final defpackage.dyl k(android.view.View view, defpackage.dyl dylVar) {
        java.lang.CharSequence charSequenceCoerceToStyledText;
        if (android.util.Log.isLoggable("ReceiveContent", 3)) {
            java.util.Objects.toString(dylVar);
            android.util.Log.d("ReceiveContent", "onReceive: ".concat(dylVar.toString()));
        }
        defpackage.dyj dyjVar = dylVar.a;
        if (dyjVar.b() == 2) {
            return dylVar;
        }
        android.content.ClipData clipDataC = dyjVar.c();
        int iA = dyjVar.a();
        android.widget.TextView textView = (android.widget.TextView) view;
        android.text.Editable editable = (android.text.Editable) textView.getText();
        android.content.Context context = textView.getContext();
        boolean z = false;
        for (int i = 0; i < clipDataC.getItemCount(); i++) {
            android.content.ClipData.Item itemAt = clipDataC.getItemAt(i);
            if ((iA & 1) != 0) {
                charSequenceCoerceToStyledText = itemAt.coerceToText(context);
                if (charSequenceCoerceToStyledText instanceof android.text.Spanned) {
                    charSequenceCoerceToStyledText = charSequenceCoerceToStyledText.toString();
                }
            } else {
                charSequenceCoerceToStyledText = itemAt.coerceToStyledText(context);
            }
            if (charSequenceCoerceToStyledText != null) {
                if (z) {
                    editable.insert(android.text.Selection.getSelectionEnd(editable), "\n");
                    editable.insert(android.text.Selection.getSelectionEnd(editable), charSequenceCoerceToStyledText);
                } else {
                    int selectionStart = android.text.Selection.getSelectionStart(editable);
                    int selectionEnd = android.text.Selection.getSelectionEnd(editable);
                    int iMax = java.lang.Math.max(0, java.lang.Math.min(selectionStart, selectionEnd));
                    int iMax2 = java.lang.Math.max(0, java.lang.Math.max(selectionStart, selectionEnd));
                    android.text.Selection.setSelection(editable, iMax2);
                    editable.replace(iMax, iMax2, charSequenceCoerceToStyledText);
                }
                z = true;
            }
        }
        return null;
    }
}
