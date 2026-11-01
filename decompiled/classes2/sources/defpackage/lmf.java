package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class lmf implements android.view.View.OnLongClickListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ lmf(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        android.widget.EditText editText = null;
        switch (this.$cid) {
            case 0:
                defpackage.lmk lmkVar = (defpackage.lmk) this.a;
                lmkVar.c.o(rmx.cd);
                j$.util.Optional optionalA = lmkVar.a();
                if (true == optionalA.isPresent()) {
                    agsm.i(272, ((defpackage.lev) optionalA.get()).j.e(false), "failed to unmute caller", new java.lang.Object[0]);
                }
                break;
            case 1:
                defpackage.kma kmaVar = (defpackage.kma) this.a;
                kmaVar.v.o(rmx.lS);
                kmaVar.I.i((java.lang.String) null).b(mce.dg);
                kmaVar.I();
                break;
            case 2:
                aooh.f(view, "p0");
                android.widget.EditText editText2 = ((defpackage.mlm) this.a).k;
                if (editText2 == null) {
                    aooh.j("digits");
                } else {
                    editText = editText2;
                }
                editText.setCursorVisible(true);
                return false;
            case 3:
                aooh.f(view, "p0");
                defpackage.mlm mlmVar = (defpackage.mlm) this.a;
                android.widget.EditText editText3 = mlmVar.k;
                if (editText3 == null) {
                    aooh.j("digits");
                } else {
                    editText = editText3;
                }
                android.text.Editable text = editText.getText();
                aooh.e(text, "getText(...)");
                if (!mlmVar.f() && !android.text.TextUtils.equals(text, "1") && !android.text.TextUtils.equals(text, "11")) {
                    return false;
                }
                text.clear();
                defpackage.mli mliVarY = mlmVar.c.y();
                agtj agtjVar = mliVarY.o;
                defpackage.mji mjiVar = mliVarY.m;
                agtjVar.i(zoe.M(ahrv.g(ahvr.F(new defpackage.lgc(mjiVar, 12), mjiVar.b)).h(new defpackage.mjl(mjiVar, 1), mjiVar.c)), mliVarY.w);
                break;
                break;
            case 4:
                aooh.f(view, "p0");
                defpackage.mlm mlmVar2 = (defpackage.mlm) this.a;
                java.util.Set set = mlmVar2.o;
                if (set.contains(view)) {
                    android.widget.EditText editText4 = mlmVar2.k;
                    if (editText4 == null) {
                        aooh.j("digits");
                        editText4 = null;
                    }
                    int selectionStart = editText4.getSelectionStart();
                    int i = selectionStart - 1;
                    android.widget.EditText editText5 = mlmVar2.k;
                    if (editText5 == null) {
                        aooh.j("digits");
                        editText5 = null;
                    }
                    android.text.Editable text2 = editText5.getText();
                    aooh.e(text2, "getText(...)");
                    java.lang.Character chY = aoov.Y(text2, i);
                    if (chY != null && chY.charValue() == '0') {
                        android.widget.EditText editText6 = mlmVar2.k;
                        if (editText6 == null) {
                            aooh.j("digits");
                            editText6 = null;
                        }
                        editText6.getText().replace(i, selectionStart, "+");
                        int i2 = selectionStart - 2;
                        android.widget.EditText editText7 = mlmVar2.k;
                        if (editText7 == null) {
                            aooh.j("digits");
                            editText7 = null;
                        }
                        android.text.Editable text3 = editText7.getText();
                        aooh.e(text3, "getText(...)");
                        java.lang.Character chY2 = aoov.Y(text3, i2);
                        if (chY2 != null && chY2.charValue() == '0') {
                            android.widget.EditText editText8 = mlmVar2.k;
                            if (editText8 == null) {
                                aooh.j("digits");
                            } else {
                                editText = editText8;
                            }
                            editText.getText().delete(i2, selectionStart - 1);
                        }
                    }
                } else {
                    mlmVar2.b(81);
                    agsm.i(365, mlmVar2.d.b(), "fail to stop tone controller", new java.lang.Object[0]);
                }
                set.remove(view);
                break;
            case 5:
                aooh.f(view, "p0");
                defpackage.mlm.a.b().l("com/android/dialer/dialpadview/ui/PreCallDialpadInputRenderer", "onLongClickDeleteButton", 206, "PreCallDialpadInputRenderer.kt").v("delete button is long clicked");
                android.widget.EditText editText9 = ((defpackage.mlm) this.a).k;
                if (editText9 == null) {
                    aooh.j("digits");
                } else {
                    editText = editText9;
                }
                editText.getText().clear();
                view.setEnabled(false);
                break;
            case 6:
                ahvr.j(new vxw(((kiu) this.a).d), view);
                break;
            case 7:
                ahvr.j(new vxw(((kiu) this.a).d), view);
                break;
            default:
                ahvr.j(new vxw(((kiu) this.a).d), view);
                break;
        }
        return true;
    }
}
