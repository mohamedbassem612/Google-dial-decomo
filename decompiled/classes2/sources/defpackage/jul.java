package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jul implements android.text.TextWatcher {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public jul(defpackage.jum jumVar, defpackage.cy cyVar, int i) {
        this.$cid = i;
        this.a = cyVar;
        j$.util.Objects.requireNonNull(jumVar);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable editable) {
        int i = this.$cid;
        if (i == 0) {
            ((defpackage.cy) this.a).b(-1).setEnabled(defpackage.jum.a(j$.util.Optional.of(editable)));
            return;
        }
        if (i == 1) {
            ((android.widget.Button) this.a).setEnabled((editable == null || editable.length() == 0) ? false : true);
            return;
        }
        if (i == 2) {
            ((defpackage.cy) this.a).b(-1).setEnabled((editable == null || editable.toString().trim().length() == 0) ? false : true);
            return;
        }
        if (i == 3) {
            aooh.f(editable, "s");
        } else if (i == 4) {
            aooh.f(editable, "s");
        } else if (i == 5) {
            ((vrh) this.a).e();
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.$cid;
        if (i4 == 3) {
            aooh.f(charSequence, "s");
        } else if (i4 == 4) {
            aooh.f(charSequence, "s");
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        switch (this.$cid) {
            case 0:
            case 1:
            case 2:
            case 5:
                break;
            case 3:
                aooh.f(charSequence, "s");
                ((tgf) this.a).e(charSequence.toString(), 1);
                break;
            case 4:
                aooh.f(charSequence, "s");
                ((tkd) this.a).aX(charSequence.toString(), 7, false);
                break;
            case 6:
                ((afkq) this.a).a.a(charSequence.toString().trim());
                break;
            default:
                ((com.google.android.material.search.SearchView) this.a).l.setVisibility(charSequence.length() <= 0 ? 8 : 0);
                break;
        }
    }

    public jul(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public jul(pay payVar, defpackage.cy cyVar, int i) {
        this.$cid = i;
        this.a = cyVar;
        j$.util.Objects.requireNonNull(payVar);
    }

    public jul(vrh vrhVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(vrhVar);
        this.a = vrhVar;
    }

    public jul(afkq afkqVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(afkqVar);
        this.a = afkqVar;
    }

    public jul(com.google.android.material.search.SearchView searchView, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(searchView);
        this.a = searchView;
    }
}
