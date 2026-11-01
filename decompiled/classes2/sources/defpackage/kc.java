package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class kc implements fr {
    final /* synthetic */ defpackage.kf a;

    public kc(defpackage.kf kfVar) {
        this.a = kfVar;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:72:0x0107  */
    /* JADX WARN: Code duplicated, block: B:74:0x010b  */
    /* JADX WARN: Code duplicated, block: B:75:0x010f  */
    public final boolean L(ft ftVar, android.view.MenuItem menuItem) {
        android.widget.EditText editText;
        android.widget.EditText editText2;
        rai raiVar = this.a.g;
        if (raiVar != null) {
            int i = ((fv) menuItem).a;
            java.lang.Object obj = raiVar.a;
            android.widget.EditText editText3 = null;
            if (i == 2131428515) {
                defpackage.mlm mlmVar = ((defpackage.mlp) obj).f;
                android.widget.EditText editText4 = mlmVar.k;
                if (editText4 == null) {
                    aooh.j("digits");
                    editText4 = null;
                }
                int selectionStart = editText4.getSelectionStart();
                android.widget.EditText editText5 = mlmVar.k;
                if (editText5 == null) {
                    aooh.j("digits");
                    editText5 = null;
                }
                int selectionEnd = editText5.getSelectionEnd();
                int iMin = java.lang.Math.min(selectionStart, selectionEnd);
                int iMax = java.lang.Math.max(selectionStart, selectionEnd);
                if (iMin == -1) {
                    android.widget.EditText editText6 = mlmVar.k;
                    if (editText6 == null) {
                        aooh.j("digits");
                        editText6 = null;
                    }
                    iMin = editText6.length();
                    android.widget.EditText editText7 = mlmVar.k;
                    if (editText7 == null) {
                        aooh.j("digits");
                        editText7 = null;
                    }
                    iMax = editText7.length();
                }
                if (iMin != 0) {
                    android.widget.EditText editText8 = mlmVar.k;
                    if (editText8 == null) {
                        aooh.j("digits");
                        editText8 = null;
                    }
                    editText8.getText().replace(iMin, iMax, ",");
                    if (iMin != iMax) {
                        android.widget.EditText editText9 = mlmVar.k;
                        if (editText9 == null) {
                            aooh.j("digits");
                        } else {
                            editText3 = editText9;
                        }
                        editText3.setSelection(iMin + 1);
                    }
                }
            } else if (i == 2131428517) {
                defpackage.mlm mlmVar2 = ((defpackage.mlp) obj).f;
                android.widget.EditText editText10 = mlmVar2.k;
                if (editText10 == null) {
                    aooh.j("digits");
                    editText10 = null;
                }
                int selectionStart2 = editText10.getSelectionStart();
                android.widget.EditText editText11 = mlmVar2.k;
                if (editText11 == null) {
                    aooh.j("digits");
                    editText11 = null;
                }
                int selectionEnd2 = editText11.getSelectionEnd();
                int iMin2 = java.lang.Math.min(selectionStart2, selectionEnd2);
                int iMax2 = java.lang.Math.max(selectionStart2, selectionEnd2);
                if (iMin2 == -1) {
                    android.widget.EditText editText12 = mlmVar2.k;
                    if (editText12 == null) {
                        aooh.j("digits");
                        editText12 = null;
                    }
                    iMin2 = editText12.length();
                    android.widget.EditText editText13 = mlmVar2.k;
                    if (editText13 == null) {
                        aooh.j("digits");
                        editText13 = null;
                    }
                    iMax2 = editText13.length();
                }
                if (iMin2 != 0) {
                    android.widget.EditText editText14 = mlmVar2.k;
                    if (editText14 == null) {
                        aooh.j("digits");
                        editText14 = null;
                    }
                    if (editText14.getText().charAt(iMin2 - 1) != ';') {
                        android.widget.EditText editText15 = mlmVar2.k;
                        if (editText15 == null) {
                            aooh.j("digits");
                            editText15 = null;
                        }
                        if (editText15.length() <= iMax2) {
                            editText = mlmVar2.k;
                            if (editText == null) {
                                aooh.j("digits");
                                editText = null;
                            }
                            editText.getText().replace(iMin2, iMax2, ";");
                            if (iMin2 != iMax2) {
                                editText2 = mlmVar2.k;
                                if (editText2 == null) {
                                    aooh.j("digits");
                                } else {
                                    editText3 = editText2;
                                }
                                editText3.setSelection(iMin2 + 1);
                            }
                        } else {
                            android.widget.EditText editText16 = mlmVar2.k;
                            if (editText16 == null) {
                                aooh.j("digits");
                                editText16 = null;
                            }
                            if (editText16.getText().charAt(iMax2) != ';') {
                                editText = mlmVar2.k;
                                if (editText == null) {
                                    aooh.j("digits");
                                    editText = null;
                                }
                                editText.getText().replace(iMin2, iMax2, ";");
                                if (iMin2 != iMax2) {
                                    editText2 = mlmVar2.k;
                                    if (editText2 == null) {
                                        aooh.j("digits");
                                    } else {
                                        editText3 = editText2;
                                    }
                                    editText3.setSelection(iMin2 + 1);
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void H(ft ftVar) {
    }
}
