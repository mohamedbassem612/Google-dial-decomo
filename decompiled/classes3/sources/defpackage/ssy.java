package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ssy implements android.widget.SeekBar.OnSeekBarChangeListener {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public ssy(com.android.dialer.playback.CallRecordingPlayer callRecordingPlayer, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(callRecordingPlayer);
        this.a = callRecordingPlayer;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(android.widget.SeekBar seekBar, int i, boolean z) {
        if (this.$cid != 0) {
            if (z) {
                androidx.preference.SeekBarPreference seekBarPreference = (androidx.preference.SeekBarPreference) this.a;
                if (seekBarPreference.f || !seekBarPreference.c) {
                    seekBarPreference.k(seekBar);
                    return;
                }
            }
            androidx.preference.SeekBarPreference seekBarPreference2 = (androidx.preference.SeekBarPreference) this.a;
            seekBarPreference2.l(i + seekBarPreference2.b);
            return;
        }
        int max = seekBar.getMax();
        int iMax = java.lang.Math.max(0, i);
        int iMax2 = java.lang.Math.max(iMax, max);
        com.android.dialer.playback.CallRecordingPlayer callRecordingPlayer = (com.android.dialer.playback.CallRecordingPlayer) this.a;
        if (callRecordingPlayer.o.getMax() != iMax2) {
            callRecordingPlayer.o.setMax(iMax2);
        }
        callRecordingPlayer.o.setProgress(iMax);
        com.android.dialer.playback.CallRecordingPlayer.f(callRecordingPlayer.t, iMax);
        com.android.dialer.playback.CallRecordingPlayer.f(callRecordingPlayer.u, max);
        if (callRecordingPlayer.b == defpackage.sta.a || !z) {
            return;
        }
        callRecordingPlayer.e.seekTo(i);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(android.widget.SeekBar seekBar) {
        int i = this.$cid;
        java.lang.Object obj = this.a;
        if (i != 0) {
            ((androidx.preference.SeekBarPreference) obj).c = true;
            return;
        }
        com.android.dialer.playback.CallRecordingPlayer callRecordingPlayer = (com.android.dialer.playback.CallRecordingPlayer) obj;
        defpackage.sta staVar = callRecordingPlayer.b;
        if (staVar != defpackage.sta.a) {
            callRecordingPlayer.n = staVar == defpackage.sta.d;
            callRecordingPlayer.c(true);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(android.widget.SeekBar seekBar) {
        int i = this.$cid;
        java.lang.Object obj = this.a;
        if (i != 0) {
            androidx.preference.SeekBarPreference seekBarPreference = (androidx.preference.SeekBarPreference) obj;
            seekBarPreference.c = false;
            if (seekBar.getProgress() + seekBarPreference.b != seekBarPreference.a) {
                seekBarPreference.k(seekBar);
                return;
            }
            return;
        }
        com.android.dialer.playback.CallRecordingPlayer callRecordingPlayer = (com.android.dialer.playback.CallRecordingPlayer) obj;
        if (callRecordingPlayer.b != defpackage.sta.a) {
            callRecordingPlayer.e.seekTo(seekBar.getProgress());
            if (callRecordingPlayer.n) {
                callRecordingPlayer.j();
            }
        }
    }

    public ssy(androidx.preference.SeekBarPreference seekBarPreference, int i) {
        this.$cid = i;
        this.a = seekBarPreference;
    }
}
