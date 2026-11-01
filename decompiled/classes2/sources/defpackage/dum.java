package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class dum {
    public dum(dsy dsyVar) {
        new java.lang.ref.WeakReference(dsyVar);
        dsq.o(dsyVar.J);
        dsq.o(dsyVar.K);
        dsq.o(dsyVar.L);
        dsq.o(dsyVar.M);
        dsq.o(dsyVar.N);
    }

    public static void a(android.content.Context context, int i, android.util.SparseArray sparseArray, android.util.SparseArray sparseArray2) {
        java.lang.String str;
        android.content.res.XmlResourceParser xml = context.getResources().getXml(i);
        try {
            defpackage.euj eujVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    java.lang.String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                defpackage.due dueVar = new defpackage.due();
                                int attributeCount = xml.getAttributeCount();
                                for (int i2 = 0; i2 < attributeCount; i2++) {
                                    java.lang.String attributeName = xml.getAttributeName(i2);
                                    java.lang.String attributeValue = xml.getAttributeValue(i2);
                                    if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                                        int i3 = -1;
                                        int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                                        if (identifier != -1) {
                                            i3 = identifier;
                                        } else if (attributeValue.length() > 1) {
                                            i3 = java.lang.Integer.parseInt(attributeValue.substring(1));
                                        } else {
                                            android.util.Log.e("ConstraintLayoutStates", "error in parsing id");
                                        }
                                        dueVar.g(context, xml);
                                        sparseArray2.put(i3, dueVar);
                                    }
                                }
                            } else {
                                continue;
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                defpackage.euj eujVar2 = new defpackage.euj(context, xml);
                                sparseArray.put(eujVar2.a, eujVar2);
                                eujVar = eujVar2;
                            } else {
                                continue;
                            }
                            break;
                        case 1382829617:
                            str = "StateSet";
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                defpackage.dtx dtxVar = new defpackage.dtx(context, xml);
                                if (eujVar != null) {
                                    ((java.util.ArrayList) eujVar.b).add(dtxVar);
                                }
                            } else {
                                continue;
                            }
                            break;
                        default:
                            continue;
                    }
                    name.equals(str);
                }
            }
        } catch (java.io.IOException e) {
            android.util.Log.e("ConstraintLayoutStates", a.bj(i, "Error parsing resource: "), e);
        } catch (org.xmlpull.v1.XmlPullParserException e2) {
            android.util.Log.e("ConstraintLayoutStates", a.bj(i, "Error parsing resource: "), e2);
        }
    }

    public static defpackage.dtq b(dsy dsyVar, int i, java.util.ArrayList arrayList, defpackage.dtq dtqVar) {
        int i2;
        int i3 = i == 0 ? dsyVar.ao : dsyVar.ap;
        if (i3 == -1 || (dtqVar != null && i3 == dtqVar.c)) {
            if (i3 == -1) {
            }
            return dtqVar;
        }
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            defpackage.dtq dtqVar2 = (defpackage.dtq) arrayList.get(i4);
            if (dtqVar2.c == i3) {
                if (dtqVar != null) {
                    dtqVar.c(i, dtqVar2);
                    arrayList.remove(dtqVar);
                }
                dtqVar = dtqVar2;
                break;
            }
        }
        if (dtqVar == null) {
            if (dsyVar instanceof dtc) {
                dtc dtcVar = (dtc) dsyVar;
                int i5 = 0;
                while (true) {
                    if (i5 >= dtcVar.as) {
                        i2 = -1;
                        break;
                    }
                    dsy dsyVar2 = dtcVar.ar[i5];
                    if (i != 0) {
                        i2 = dsyVar2.ap;
                        if (i2 != -1) {
                            break;
                        }
                        i5++;
                    } else {
                        i2 = dsyVar2.ao;
                        if (i2 != -1) {
                            break;
                        }
                        i5++;
                    }
                }
                if (i2 != -1) {
                    for (int i6 = 0; i6 < arrayList.size(); i6++) {
                        defpackage.dtq dtqVar3 = (defpackage.dtq) arrayList.get(i6);
                        if (dtqVar3.c == i2) {
                            dtqVar = dtqVar3;
                            break;
                        }
                    }
                }
            }
            if (dtqVar == null) {
                dtqVar = new defpackage.dtq(i);
            }
            arrayList.add(dtqVar);
        }
        if (dtqVar.d(dsyVar)) {
            if (dsyVar instanceof dtb) {
                dtb dtbVar = (dtb) dsyVar;
                dtbVar.d.c(dtbVar.ar == 0 ? 1 : 0, arrayList, dtqVar);
            }
            if (i == 0) {
                dsyVar.ao = dtqVar.c;
                dsyVar.J.c(0, arrayList, dtqVar);
                dsyVar.L.c(0, arrayList, dtqVar);
            } else {
                dsyVar.ap = dtqVar.c;
                dsyVar.K.c(1, arrayList, dtqVar);
                dsyVar.N.c(1, arrayList, dtqVar);
                dsyVar.M.c(1, arrayList, dtqVar);
            }
            dsyVar.Q.c(i, arrayList, dtqVar);
        }
        return dtqVar;
    }

    public static defpackage.dtq c(java.util.ArrayList arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            defpackage.dtq dtqVar = (defpackage.dtq) arrayList.get(i2);
            if (i == dtqVar.c) {
                return dtqVar;
            }
        }
        return null;
    }

    public static boolean d(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }

    public static java.lang.Object getTag(android.view.View view) {
        return ((defpackage.dup) view.getLayoutParams()).q;
    }

    public static void setTag(android.view.View view, java.lang.Object obj) {
        ((defpackage.dup) view.getLayoutParams()).q = obj;
    }

    public boolean blocksInteractionBelow(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view) {
        return getScrimOpacity(coordinatorLayout, view) > 0.0f;
    }

    public boolean getInsetDodgeRect(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.graphics.Rect rect) {
        return false;
    }

    public int getScrimColor(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view) {
        return -16777216;
    }

    public float getScrimOpacity(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view) {
        return 0.0f;
    }

    public boolean layoutDependsOn(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2) {
        return false;
    }

    public boolean onDependentViewChanged(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2) {
        return false;
    }

    public boolean onInterceptTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.MotionEvent motionEvent) {
        return false;
    }

    public boolean onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i) {
        return false;
    }

    public boolean onMeasureChild(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i, int i2, int i3, int i4) {
        return false;
    }

    public boolean onNestedFling(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, float f, float f2, boolean z) {
        return false;
    }

    public boolean onNestedPreFling(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, float f, float f2) {
        return false;
    }

    public void onNestedPreScroll(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(coordinatorLayout, view, view2, i, i2, iArr);
        }
    }

    public void onNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        onNestedScroll(coordinatorLayout, view, view2, i, i2, i3, i4, i5);
    }

    public void onNestedScrollAccepted(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, android.view.View view3, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(coordinatorLayout, view, view2, view3, i);
        }
    }

    public boolean onRequestChildRectangleOnScreen(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.graphics.Rect rect, boolean z) {
        return false;
    }

    public android.os.Parcelable onSaveInstanceState(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view) {
        return android.view.View.BaseSavedState.EMPTY_STATE;
    }

    public boolean onStartNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, android.view.View view3, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(coordinatorLayout, view, view2, view3, i);
        }
        return false;
    }

    public void onStopNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, int i) {
        if (i == 0) {
            onStopNestedScroll(coordinatorLayout, view, view2);
        }
    }

    public boolean onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.MotionEvent motionEvent) {
        return false;
    }

    @java.lang.Deprecated
    public void onNestedPreScroll(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, int i, int i2, int[] iArr) {
    }

    @java.lang.Deprecated
    public void onNestedScrollAccepted(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, android.view.View view3, int i) {
    }

    @java.lang.Deprecated
    public void onStopNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2) {
    }

    @java.lang.Deprecated
    public boolean onStartNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, android.view.View view3, int i) {
        return false;
    }

    @java.lang.Deprecated
    public void onNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(coordinatorLayout, view, view2, i, i2, i3, i4);
        }
    }

    @java.lang.Deprecated
    public void onNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, int i, int i2, int i3, int i4) {
    }

    public void onDetachedFromLayoutParams() {
    }

    public void onAttachedToLayoutParams(defpackage.dup dupVar) {
    }

    public dum(android.content.Context context, android.util.AttributeSet attributeSet) {
    }

    public dum() {
    }

    public eax onApplyWindowInsets(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, eax eaxVar) {
        return eaxVar;
    }

    public void onDependentViewRemoved(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2) {
    }

    public void onRestoreInstanceState(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.os.Parcelable parcelable) {
    }
}
